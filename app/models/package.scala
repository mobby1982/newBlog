import java.sql.Timestamp

package object models {

  import java.sql.Date
  import org.joda.time.DateTime
  import slick.driver.MySQLDriver.api._


  implicit def dateTime  =
    MappedColumnType.base[DateTime, Timestamp](
      dt => new Timestamp(dt.getMillis),
      ts => new DateTime(ts.getTime)
    )
    
}
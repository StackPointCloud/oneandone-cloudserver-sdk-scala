package oneandone.monitoringcenters

case class ResourceStatus(
    warning: Option[Double],
    critical: Option[Double],
    data: Option[List[Data]],
    unit: Option[Unit],
    status: Option[String]
) {}

case class Unit(
    usedPsercent: String
)

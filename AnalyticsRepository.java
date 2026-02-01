@Repository
public interface AnalyticsRepository extends JpaRepository<AnalyticsRecord, Long> {

    @Query("SELECT a FROM AnalyticsRecord a WHERE a.metric = :metric")
    List<AnalyticsRecord> findByMetric(@Param("metric") String metric);
}

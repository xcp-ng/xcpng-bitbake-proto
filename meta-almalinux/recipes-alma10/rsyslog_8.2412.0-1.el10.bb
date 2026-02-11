
PN = "rsyslog"
PE = "0"
PV = "8.2412.0"
PR = "1.el10"
PACKAGES = "rsyslog rsyslog-crypto rsyslog-doc rsyslog-elasticsearch rsyslog-gnutls rsyslog-gssapi rsyslog-kafka rsyslog-mmaudit rsyslog-mmfields rsyslog-mmjsonparse rsyslog-mmkubernetes rsyslog-mmnormalize rsyslog-mmsnmptrapd rsyslog-mysql rsyslog-omamqp1 rsyslog-openssl rsyslog-pgsql rsyslog-relp rsyslog-snmp rsyslog-udpspoof"


URI_rsyslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libcurl.so.4()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libfastjson.so.4()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_246)(64bit) ( ) libestr.so.0()(64bit) ( ) bash ( >=  2.0)"
RPROVIDES:rsyslog = "syslog ( ) rsyslog ( =  8.2412.0-1.el10) config(rsyslog) ( =  8.2412.0-1.el10) rsyslog(x86-64) ( =  8.2412.0-1.el10) rsyslog-logrotate ( =  8.2412.0-1.el10)"

URI_rsyslog-crypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-crypto-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-crypto = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-crypto = "rsyslog-crypto ( =  8.2412.0-1.el10) rsyslog-crypto(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-doc-8.2412.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:rsyslog-doc = ""
RPROVIDES:rsyslog-doc = "rsyslog-doc ( =  8.2412.0-1.el10)"

URI_rsyslog-elasticsearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-elasticsearch-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-elasticsearch = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libcurl.so.4()(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-elasticsearch = "rsyslog-elasticsearch ( =  8.2412.0-1.el10) rsyslog-elasticsearch(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-gnutls = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-gnutls-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-gnutls = "rtld(GNU_HASH) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-gnutls = "rsyslog-gnutls ( =  8.2412.0-1.el10) rsyslog-gnutls(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-gssapi-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-gssapi = "rtld(GNU_HASH) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libc.so.6(GLIBC_2.15)(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-gssapi = "rsyslog-gssapi ( =  8.2412.0-1.el10) rsyslog-gssapi(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-kafka = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-kafka-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-kafka = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcap-ng.so.0()(64bit) ( ) librdkafka.so.1()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-kafka = "rsyslog-kafka ( =  8.2412.0-1.el10) rsyslog-kafka(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mmaudit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmaudit-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mmaudit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mmaudit = "rsyslog-mmaudit ( =  8.2412.0-1.el10) rsyslog-mmaudit(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mmfields = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmfields-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mmfields = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mmfields = "rsyslog-mmfields ( =  8.2412.0-1.el10) rsyslog-mmfields(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mmjsonparse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmjsonparse-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mmjsonparse = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libfastjson.so.4()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mmjsonparse = "rsyslog-mmjsonparse ( =  8.2412.0-1.el10) rsyslog-mmjsonparse(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mmkubernetes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmkubernetes-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mmkubernetes = "rtld(GNU_HASH) ( ) libcurl.so.4()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libfastjson.so.4()(64bit) ( ) liblognorm.so.5()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mmkubernetes = "rsyslog-mmkubernetes ( =  8.2412.0-1.el10) rsyslog-mmkubernetes(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mmnormalize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmnormalize-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mmnormalize = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libfastjson.so.4()(64bit) ( ) liblognorm.so.5()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mmnormalize = "rsyslog-mmnormalize ( =  8.2412.0-1.el10) rsyslog-mmnormalize(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mmsnmptrapd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmsnmptrapd-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mmsnmptrapd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mmsnmptrapd = "rsyslog-mmsnmptrapd ( =  8.2412.0-1.el10) rsyslog-mmsnmptrapd(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mysql-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-mysql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libmariadb.so.3()(64bit) ( ) libmariadb.so.3(libmysqlclient_18)(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-mysql = "rsyslog-mysql ( =  8.2412.0-1.el10) rsyslog-mysql(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-omamqp1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-omamqp1-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-omamqp1 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libsasl2.so.3()(64bit) ( ) openssl-libs ( ) cyrus-sasl-lib ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-omamqp1 = "rsyslog-omamqp1 ( =  8.2412.0-1.el10) rsyslog-omamqp1(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-openssl-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-openssl = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) openssl-libs ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-openssl = "rsyslog-openssl ( =  8.2412.0-1.el10) rsyslog-openssl(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-pgsql-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-pgsql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-pgsql = "rsyslog-pgsql ( =  8.2412.0-1.el10) rsyslog-pgsql(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-relp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-relp-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-relp = "rtld(GNU_HASH) ( ) libcap-ng.so.0()(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) librelp.so.0()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-relp = "rsyslog-relp ( =  8.2412.0-1.el10) rsyslog-relp(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-snmp-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-snmp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-snmp = "rsyslog-snmp ( =  8.2412.0-1.el10) rsyslog-snmp(x86-64) ( =  8.2412.0-1.el10)"

URI_rsyslog-udpspoof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-udpspoof-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsyslog-udpspoof = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libnet.so.1()(64bit) ( ) rsyslog ( =  8.2412.0-1.el10)"
RPROVIDES:rsyslog-udpspoof = "rsyslog-udpspoof ( =  8.2412.0-1.el10) rsyslog-udpspoof(x86-64) ( =  8.2412.0-1.el10)"

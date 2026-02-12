
inherit dnf-bridge

PN = "rsyslog"
PE = "0"
PV = "8.2412.0"
PR = "1.el10"
PACKAGES = "rsyslog rsyslog-crypto rsyslog-doc rsyslog-elasticsearch rsyslog-gnutls rsyslog-gssapi rsyslog-kafka rsyslog-mmaudit rsyslog-mmfields rsyslog-mmjsonparse rsyslog-mmkubernetes rsyslog-mmnormalize rsyslog-mmsnmptrapd rsyslog-mysql rsyslog-omamqp1 rsyslog-openssl rsyslog-pgsql rsyslog-relp rsyslog-snmp rsyslog-udpspoof"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rsyslog-8.2412.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rsyslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog}"
RDEPENDS:rsyslog = " \
 libuuid \
 zlib-ng-compat \
 systemd-libs \
 libgcc \
 libcap-ng \
 libestr \
 bash \
 libcurl \
 glibc \
 libfastjson \
"

URI_rsyslog-crypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-crypto-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-crypto}"
RDEPENDS:rsyslog-crypto = " \
 glibc \
 rsyslog \
 openssl-libs \
 libcap-ng \
"

URI_rsyslog-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-doc-8.2412.0-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-doc}"
RDEPENDS:rsyslog-doc = ""

URI_rsyslog-elasticsearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-elasticsearch-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-elasticsearch}"
RDEPENDS:rsyslog-elasticsearch = " \
 glibc \
 rsyslog \
 libcap-ng \
 libcurl \
"

URI_rsyslog-gnutls = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-gnutls-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-gnutls}"
RDEPENDS:rsyslog-gnutls = " \
 glibc \
 rsyslog \
 gnutls \
 libcap-ng \
"

URI_rsyslog-gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-gssapi-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-gssapi}"
RDEPENDS:rsyslog-gssapi = " \
 glibc \
 krb5-libs \
 rsyslog \
 libcap-ng \
"

URI_rsyslog-kafka = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-kafka-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-kafka}"
RDEPENDS:rsyslog-kafka = " \
 glibc \
 rsyslog \
 librdkafka \
 libcap-ng \
"

URI_rsyslog-mmaudit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmaudit-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mmaudit}"
RDEPENDS:rsyslog-mmaudit = " \
 glibc \
 rsyslog \
 libcap-ng \
"

URI_rsyslog-mmfields = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmfields-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mmfields}"
RDEPENDS:rsyslog-mmfields = " \
 glibc \
 rsyslog \
 libcap-ng \
"

URI_rsyslog-mmjsonparse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmjsonparse-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mmjsonparse}"
RDEPENDS:rsyslog-mmjsonparse = " \
 glibc \
 libfastjson \
 rsyslog \
 libcap-ng \
"

URI_rsyslog-mmkubernetes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmkubernetes-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mmkubernetes}"
RDEPENDS:rsyslog-mmkubernetes = " \
 rsyslog \
 liblognorm \
 libcap-ng \
 libcurl \
 glibc \
 libfastjson \
"

URI_rsyslog-mmnormalize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmnormalize-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mmnormalize}"
RDEPENDS:rsyslog-mmnormalize = " \
 rsyslog \
 liblognorm \
 libcap-ng \
 glibc \
 libfastjson \
"

URI_rsyslog-mmsnmptrapd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mmsnmptrapd-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mmsnmptrapd}"
RDEPENDS:rsyslog-mmsnmptrapd = " \
 glibc \
 rsyslog \
 libcap-ng \
"

URI_rsyslog-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-mysql-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-mysql}"
RDEPENDS:rsyslog-mysql = " \
 glibc \
 rsyslog \
 mariadb-connector-c \
"

URI_rsyslog-omamqp1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-omamqp1-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-omamqp1}"
RDEPENDS:rsyslog-omamqp1 = " \
 rsyslog \
 openssl-libs \
 libcap-ng \
 cyrus-sasl-lib \
 glibc \
"

URI_rsyslog-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-openssl-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-openssl}"
RDEPENDS:rsyslog-openssl = " \
 glibc \
 rsyslog \
 openssl-libs \
 libcap-ng \
"

URI_rsyslog-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-pgsql-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-pgsql}"
RDEPENDS:rsyslog-pgsql = " \
 glibc \
 rsyslog \
 libpq \
 libcap-ng \
"

URI_rsyslog-relp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-relp-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-relp}"
RDEPENDS:rsyslog-relp = " \
 glibc \
 rsyslog \
 librelp \
 libcap-ng \
"

URI_rsyslog-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-snmp-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-snmp}"
RDEPENDS:rsyslog-snmp = " \
 glibc \
 rsyslog \
 net-snmp-libs \
 libcap-ng \
"

URI_rsyslog-udpspoof = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsyslog-udpspoof-8.2412.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rsyslog-udpspoof}"
RDEPENDS:rsyslog-udpspoof = " \
 glibc \
 rsyslog \
 libnet \
 libcap-ng \
"

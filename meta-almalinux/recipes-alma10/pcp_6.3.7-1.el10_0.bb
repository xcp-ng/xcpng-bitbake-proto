
PN = "pcp"
PE = "0"
PV = "6.3.7"
PR = "1.el10_0"
PACKAGES = "pcp pcp-conf pcp-devel pcp-doc pcp-export-pcp2elasticsearch pcp-export-pcp2graphite pcp-export-pcp2influxdb pcp-export-pcp2json pcp-export-pcp2openmetrics pcp-export-pcp2spark pcp-export-pcp2xml pcp-export-pcp2zabbix pcp-export-zabbix-agent pcp-geolocate pcp-gui pcp-import-collectl2pcp pcp-import-ganglia2pcp pcp-import-iostat2pcp pcp-import-mrtg2pcp pcp-import-sar2pcp pcp-libs pcp-libs-devel pcp-pmda-activemq pcp-pmda-amdgpu pcp-pmda-apache pcp-pmda-bash pcp-pmda-bcc pcp-pmda-bind2 pcp-pmda-bonding pcp-pmda-bpf pcp-pmda-bpftrace pcp-pmda-cifs pcp-pmda-cisco pcp-pmda-dbping pcp-pmda-denki pcp-pmda-dm pcp-pmda-docker pcp-pmda-ds389 pcp-pmda-ds389log pcp-pmda-elasticsearch pcp-pmda-farm pcp-pmda-gluster pcp-pmda-gpfs pcp-pmda-gpsd pcp-pmda-hacluster pcp-pmda-haproxy pcp-pmda-infiniband pcp-pmda-json pcp-pmda-libvirt pcp-pmda-lio pcp-pmda-lmsensors pcp-pmda-logger pcp-pmda-lustre pcp-pmda-lustrecomm pcp-pmda-mailq pcp-pmda-memcache pcp-pmda-mic pcp-pmda-mongodb pcp-pmda-mounts pcp-pmda-mssql pcp-pmda-mysql pcp-pmda-named pcp-pmda-netcheck pcp-pmda-netfilter pcp-pmda-news pcp-pmda-nfsclient pcp-pmda-nginx pcp-pmda-nvidia-gpu pcp-pmda-openmetrics pcp-pmda-openvswitch pcp-pmda-oracle pcp-pmda-pdns pcp-pmda-perfevent pcp-pmda-podman pcp-pmda-postfix pcp-pmda-postgresql pcp-pmda-rabbitmq pcp-pmda-redis pcp-pmda-resctrl pcp-pmda-roomtemp pcp-pmda-rsyslog pcp-pmda-samba pcp-pmda-sendmail pcp-pmda-shping pcp-pmda-slurm pcp-pmda-smart pcp-pmda-snmp pcp-pmda-sockets pcp-pmda-statsd pcp-pmda-summary pcp-pmda-systemd pcp-pmda-trace pcp-pmda-unbound pcp-pmda-uwsgi pcp-pmda-weblog pcp-pmda-zimbra pcp-pmda-zswap pcp-selinux pcp-system-tools pcp-zeroconf perl-PCP-LogImport perl-PCP-LogSummary perl-PCP-MMV perl-PCP-PMDA python3-pcp pcp-testsuite"


URI_pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp = " \
 libuv \
 diffutils \
 which \
 sed \
 xz \
 zlib-ng-compat \
 openssl-libs \
 grep \
 pcp-libs \
 bash \
 findutils \
 glibc \
 gawk \
 readline \
 pkgconf-pkg-config \
 hostname \
 pcp-selinux \
 procps-ng \
 coreutils \
"

URI_pcp-conf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-conf-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-conf = ""

URI_pcp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-devel-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-devel = " \
 perl-libs \
 perl-vars \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 pcp-libs-devel \
 glibc \
 perl-interpreter \
"

URI_pcp-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-doc-6.3.7-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:pcp-doc = ""

URI_pcp-export-pcp2elasticsearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2elasticsearch-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2elasticsearch = " \
 pcp \
 python3-requests \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2graphite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2graphite-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2graphite = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2influxdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2influxdb-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2influxdb = " \
 pcp \
 python3-requests \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2json-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2json = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2openmetrics = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2openmetrics-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2openmetrics = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2spark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2spark-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2spark = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2xml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2xml-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2xml = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-pcp2zabbix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2zabbix-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2zabbix = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-export-zabbix-agent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-zabbix-agent-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-zabbix-agent = " \
 glibc \
 pcp-libs \
"

URI_pcp-geolocate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-geolocate-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-geolocate = " \
 pcp \
 pcp-libs \
 python3-pcp \
"

URI_pcp-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-gui-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-gui = " \
 qt6-qtsvg \
 pcp \
 libgcc \
 qt6-qtbase \
 liberation-sans-fonts \
 pcp-libs \
 libstdc++ \
 bash \
 qt6-qtbase-gui \
 glibc \
"

URI_pcp-import-collectl2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-collectl2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-collectl2pcp = " \
 glibc \
 pcp-libs \
"

URI_pcp-import-ganglia2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-ganglia2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-ganglia2pcp = " \
 perl-TimeDate \
 perl-libs \
 perl-vars \
 perl-PCP-LogImport \
 perl-File-Basename \
 perl-POSIX \
 perl-Getopt-Std \
 pcp-libs \
 perl-interpreter \
 rrdtool-perl \
"

URI_pcp-import-iostat2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-iostat2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-iostat2pcp = " \
 perl-TimeDate \
 perl-libs \
 perl-PCP-LogImport \
 perl-Getopt-Std \
 pcp-libs \
 perl-interpreter \
"

URI_pcp-import-mrtg2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-mrtg2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-mrtg2pcp = " \
 perl-interpreter \
 perl-libs \
 pcp-libs \
 perl-PCP-LogImport \
"

URI_pcp-import-sar2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-sar2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-sar2pcp = " \
 perl-TimeDate \
 perl-libs \
 perl-PCP-LogImport \
 pcp-libs \
 perl-XML-TokeParser \
 perl-interpreter \
"

URI_pcp-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-libs-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-libs = " \
 systemd-libs \
 openssl-libs \
 pcp-conf \
 cyrus-sasl-lib \
 avahi-libs \
 libuv \
 glibc \
 xz-libs \
"

URI_pcp-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-libs-devel-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-libs-devel = " \
 pcp-libs \
 pcp \
"

URI_pcp-pmda-activemq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-activemq-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-activemq = " \
 perl-libs \
 perl-libwww-perl \
 perl-Digest-MD5 \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-JSON \
 perl-Time-HiRes \
"

URI_pcp-pmda-amdgpu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-amdgpu-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-amdgpu = " \
 pcp \
 pcp-libs \
 bash \
 glibc \
 libdrm \
"

URI_pcp-pmda-apache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-apache-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-apache = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-bash = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bash-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bash = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-bcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bcc-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bcc = " \
 python3-bcc \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
"

URI_pcp-pmda-bind2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bind2-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bind2 = " \
 perl-libwww-perl \
 pcp \
 perl-PCP-PMDA \
 perl-XML-LibXML \
 pcp-libs \
 bash \
 perl-autodie \
 perl-File-Slurp \
 perl-Time-HiRes \
"

URI_pcp-pmda-bonding = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bonding-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bonding = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-bpf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bpf-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bpf = " \
 zlib-ng-compat \
 pcp \
 libbpf \
 elfutils-libelf \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-bpftrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bpftrace-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bpftrace = " \
 python3 \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
 bpftrace \
"

URI_pcp-pmda-cifs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-cifs-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-cifs = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-cisco = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-cisco-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-cisco = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-dbping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-dbping-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-dbping = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-DBI \
"

URI_pcp-pmda-denki = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-denki-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-denki = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-dm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-dm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-dm = " \
 device-mapper-libs \
 pcp \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-docker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-docker-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-docker = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-ds389 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-ds389-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-ds389 = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-ds389log = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-ds389log-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-ds389log = " \
 perl-Date-Manip \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
"

URI_pcp-pmda-elasticsearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-elasticsearch-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-elasticsearch = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-farm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-farm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-farm = " \
 smartmontools \
 pcp \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-gluster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-gluster-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-gluster = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-gpfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-gpfs-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-gpfs = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-gpsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-gpsd-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-gpsd = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-JSON \
 perl-Time-HiRes \
"

URI_pcp-pmda-hacluster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-hacluster-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-hacluster = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-haproxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-haproxy-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-haproxy = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-infiniband = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-infiniband-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-infiniband = " \
 infiniband-diags \
 pcp \
 pcp-libs \
 libibumad \
 bash \
 glibc \
"

URI_pcp-pmda-json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-json-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-json = " \
 python3-pcp \
 pcp \
 python3-six \
 pcp-libs \
 bash \
 python3-jsonpointer \
"

URI_pcp-pmda-libvirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-libvirt-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-libvirt = " \
 python3-pcp \
 pcp \
 python3-libvirt \
 pcp-libs \
 bash \
 python3-lxml \
"

URI_pcp-pmda-lio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lio-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lio = " \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
 python3-rtslib \
"

URI_pcp-pmda-lmsensors = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lmsensors-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lmsensors = " \
 lm_sensors \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
"

URI_pcp-pmda-logger = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-logger-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-logger = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-lustre = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lustre-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lustre = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-lustrecomm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lustrecomm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lustrecomm = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-mailq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mailq-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mailq = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-memcache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-memcache-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-memcache = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-mic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mic-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mic = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-mongodb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mongodb-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mongodb = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-mounts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mounts-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mounts = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-mssql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mssql-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mssql = " \
 python3-pcp \
 pcp \
 python3-pyodbc \
 pcp-libs \
 bash \
"

URI_pcp-pmda-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mysql-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mysql = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-DBD-MySQL \
 perl-DBI \
"

URI_pcp-pmda-named = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-named-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-named = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-netcheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-netcheck-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-netcheck = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-netfilter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-netfilter-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-netfilter = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-news = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-news-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-news = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-nfsclient = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-nfsclient-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-nfsclient = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-nginx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-nginx-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-nginx = " \
 perl-libwww-perl \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
"

URI_pcp-pmda-nvidia-gpu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-nvidia-gpu-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-nvidia-gpu = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-openmetrics = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-openmetrics-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-openmetrics = " \
 python3-requests \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
"

URI_pcp-pmda-openvswitch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-openvswitch-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-openvswitch = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-oracle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-oracle-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-oracle = " \
 perl-libs \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-DBI \
 perl-interpreter \
"

URI_pcp-pmda-pdns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-pdns-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-pdns = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-Time-HiRes \
"

URI_pcp-pmda-perfevent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-perfevent-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-perfevent = " \
 perl-libs \
 pcp \
 libpfm \
 pcp-libs \
 bash \
 glibc \
 perl-interpreter \
"

URI_pcp-pmda-podman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-podman-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-podman = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-postfix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-postfix-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-postfix = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 postfix-perl-scripts \
 perl-Time-HiRes \
"

URI_pcp-pmda-postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-postgresql-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-postgresql = " \
 python3-psycopg2 \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
"

URI_pcp-pmda-rabbitmq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-rabbitmq-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-rabbitmq = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-redis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-redis-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-redis = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 perl-autodie \
 perl-Data-Dumper \
 perl-Time-HiRes \
"

URI_pcp-pmda-resctrl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-resctrl-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-resctrl = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-roomtemp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-roomtemp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-roomtemp = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-rsyslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-rsyslog-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-rsyslog = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-samba = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-samba-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-samba = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-sendmail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-sendmail-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-sendmail = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-shping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-shping-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-shping = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-slurm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-slurm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-slurm = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-smart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-smart-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-smart = " \
 smartmontools \
 pcp \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-snmp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-snmp = " \
 pcp-libs \
 pcp \
 bash \
 perl-PCP-PMDA \
"

URI_pcp-pmda-sockets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-sockets-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-sockets = " \
 iproute \
 pcp \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-statsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-statsd-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-statsd = " \
 chan \
 pcp \
 pcp-libs \
 bash \
 glibc \
 HdrHistogram_c \
"

URI_pcp-pmda-summary = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-summary-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-summary = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-systemd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-systemd-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-systemd = " \
 systemd-libs \
 pcp \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-trace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-trace-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-trace = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-unbound-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-unbound = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-uwsgi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-uwsgi-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-uwsgi = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-pmda-weblog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-weblog-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-weblog = " \
 glibc \
 pcp-libs \
 pcp \
 bash \
"

URI_pcp-pmda-zimbra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-zimbra-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-zimbra = " \
 pcp \
 perl-PCP-PMDA \
 pcp-libs \
 bash \
 glibc \
"

URI_pcp-pmda-zswap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-zswap-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-zswap = " \
 pcp \
 bash \
 pcp-libs \
 python3-pcp \
"

URI_pcp-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-selinux-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-selinux = " \
 bash \
 selinux-policy-targeted \
 policycoreutils \
"

URI_pcp-system-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-system-tools-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-system-tools = " \
 python3-pcp \
 pcp \
 pcp-libs \
 bash \
 ncurses-libs \
 glibc \
"

URI_pcp-zeroconf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-zeroconf-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-zeroconf = " \
 pcp \
 pcp-pmda-nfsclient \
 pcp-system-tools \
 pcp-doc \
 pcp-pmda-dm \
 pcp-libs \
 pcp-pmda-openmetrics \
 bash \
"

URI_perl-PCP-LogImport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-LogImport-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-LogImport = " \
 perl-libs \
 perl-interpreter \
 perl-DynaLoader \
 pcp-libs \
 glibc \
 perl-Exporter \
"

URI_perl-PCP-LogSummary = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-LogSummary-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-LogSummary = " \
 perl-libs \
 perl-vars \
 perl-interpreter \
 perl-PCP-LogSummary \
 pcp-libs \
 perl-Exporter \
"

URI_perl-PCP-MMV = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-MMV-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-MMV = " \
 perl-libs \
 perl-vars \
 perl-interpreter \
 perl-PCP-MMV \
 perl-DynaLoader \
 pcp-libs \
 glibc \
 perl-Exporter \
 perl-Time-HiRes \
"

URI_perl-PCP-PMDA = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-PMDA-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-PMDA = " \
 perl-libs \
 perl-vars \
 perl-interpreter \
 perl-DynaLoader \
 pcp-libs \
 glibc \
 perl-Exporter \
"

URI_python3-pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pcp = " \
 glibc \
 pcp-libs \
 pcp \
 python3 \
"

URI_pcp-testsuite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pcp-testsuite-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-testsuite = " \
 pcp \
 pcp-devel \
 pcp-export-pcp2json \
 pcp-export-pcp2openmetrics \
 pcp-export-pcp2spark \
 selinux-policy-targeted \
 pcp-export-pcp2xml \
 setools-console \
 pcp-export-pcp2zabbix \
 perl-TimeDate \
 pcp-geolocate \
 pcp-gui \
 libgcc \
 avahi-libs \
 pcp-libs \
 bash \
 pcp-libs-devel \
 bc \
 pcp-pmda-activemq \
 pcp-pmda-amdgpu \
 pcp-pmda-apache \
 pcp-pmda-bash \
 pcp-pmda-bcc \
 pcp-pmda-bind2 \
 pcp-pmda-bonding \
 bzip2 \
 pcp-pmda-bpf \
 pcp-pmda-bpftrace \
 gzip \
 pcp-pmda-cisco \
 pcp-pmda-dbping \
 qt6-qtbase \
 pcp-pmda-denki \
 pcp-pmda-dm \
 pcp-pmda-docker \
 qt6-qtbase-gui \
 pcp-pmda-ds389 \
 pcp-pmda-ds389log \
 pcp-pmda-elasticsearch \
 pcp-pmda-farm \
 perl-interpreter \
 pcp-pmda-gluster \
 pcp-pmda-gpfs \
 pcp-pmda-gpsd \
 perl-libnet \
 pcp-pmda-hacluster \
 perl-libs \
 systemd-libs \
 pcp-pmda-haproxy \
 pcp-pmda-json \
 pcp-pmda-libvirt \
 pcp-pmda-lio \
 pcp-pmda-lmsensors \
 pcp-pmda-logger \
 cyrus-sasl-lib \
 pcp-pmda-lustre \
 pcp-pmda-lustrecomm \
 pcp-pmda-mailq \
 pcp-pmda-memcache \
 pcp-pmda-mic \
 pcp-pmda-mongodb \
 pcp-pmda-mounts \
 pcp-pmda-mssql \
 pcp-pmda-mysql \
 pcp-pmda-named \
 pcp-pmda-netcheck \
 pcp-pmda-netfilter \
 pcp-pmda-news \
 pcp-pmda-nfsclient \
 pcp-pmda-nginx \
 pcp-pmda-nvidia-gpu \
 pcp-pmda-openmetrics \
 libstdc++ \
 pcp-pmda-openvswitch \
 pcp-pmda-oracle \
 gcc \
 pcp-pmda-pdns \
 pcp-pmda-podman \
 xz-libs \
 pcp-pmda-postfix \
 pcp-pmda-postgresql \
 pcp-pmda-rabbitmq \
 pcp-pmda-resctrl \
 redhat-rpm-config \
 pcp-pmda-roomtemp \
 pcp-pmda-samba \
 pcp-pmda-sendmail \
 pcp-pmda-shping \
 pcp-pmda-slurm \
 pcp-pmda-smart \
 pcp-pmda-snmp \
 pcp-pmda-sockets \
 pcp-pmda-statsd \
 pcp-pmda-summary \
 pcp-pmda-trace \
 pcp-pmda-unbound \
 pcp-pmda-uwsgi \
 pcp-pmda-weblog \
 pcp-pmda-zimbra \
 pcp-pmda-zswap \
 pcp-system-tools \
 glibc \
 openssl-libs \
 perl-Exporter \
 python3 \
 perl-Getopt-Long \
 perl-Getopt-Std \
 selinux-policy-devel \
 perl-IO \
 perl-PCP-LogImport \
"

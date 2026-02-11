
PN = "pcp"
PE = "0"
PV = "6.3.7"
PR = "1.el10_0"
PACKAGES = "pcp pcp-conf pcp-devel pcp-doc pcp-export-pcp2elasticsearch pcp-export-pcp2graphite pcp-export-pcp2influxdb pcp-export-pcp2json pcp-export-pcp2openmetrics pcp-export-pcp2spark pcp-export-pcp2xml pcp-export-pcp2zabbix pcp-export-zabbix-agent pcp-geolocate pcp-gui pcp-import-collectl2pcp pcp-import-ganglia2pcp pcp-import-iostat2pcp pcp-import-mrtg2pcp pcp-import-sar2pcp pcp-libs pcp-libs-devel pcp-pmda-activemq pcp-pmda-amdgpu pcp-pmda-apache pcp-pmda-bash pcp-pmda-bcc pcp-pmda-bind2 pcp-pmda-bonding pcp-pmda-bpf pcp-pmda-bpftrace pcp-pmda-cifs pcp-pmda-cisco pcp-pmda-dbping pcp-pmda-denki pcp-pmda-dm pcp-pmda-docker pcp-pmda-ds389 pcp-pmda-ds389log pcp-pmda-elasticsearch pcp-pmda-farm pcp-pmda-gluster pcp-pmda-gpfs pcp-pmda-gpsd pcp-pmda-hacluster pcp-pmda-haproxy pcp-pmda-infiniband pcp-pmda-json pcp-pmda-libvirt pcp-pmda-lio pcp-pmda-lmsensors pcp-pmda-logger pcp-pmda-lustre pcp-pmda-lustrecomm pcp-pmda-mailq pcp-pmda-memcache pcp-pmda-mic pcp-pmda-mongodb pcp-pmda-mounts pcp-pmda-mssql pcp-pmda-mysql pcp-pmda-named pcp-pmda-netcheck pcp-pmda-netfilter pcp-pmda-news pcp-pmda-nfsclient pcp-pmda-nginx pcp-pmda-nvidia-gpu pcp-pmda-openmetrics pcp-pmda-openvswitch pcp-pmda-oracle pcp-pmda-pdns pcp-pmda-perfevent pcp-pmda-podman pcp-pmda-postfix pcp-pmda-postgresql pcp-pmda-rabbitmq pcp-pmda-redis pcp-pmda-resctrl pcp-pmda-roomtemp pcp-pmda-rsyslog pcp-pmda-samba pcp-pmda-sendmail pcp-pmda-shping pcp-pmda-slurm pcp-pmda-smart pcp-pmda-snmp pcp-pmda-sockets pcp-pmda-statsd pcp-pmda-summary pcp-pmda-systemd pcp-pmda-trace pcp-pmda-unbound pcp-pmda-uwsgi pcp-pmda-weblog pcp-pmda-zimbra pcp-pmda-zswap pcp-selinux pcp-system-tools pcp-zeroconf perl-PCP-LogImport perl-PCP-LogSummary perl-PCP-MMV perl-PCP-PMDA python3-pcp pcp-testsuite"


URI_pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/pkg-config ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) coreutils ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) findutils ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) grep ( ) libreadline.so.8()(64bit) ( ) gawk ( ) sed ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) bash ( ) libuv.so.1()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) xz ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libpcp_import.so.1()(64bit) ( ) diffutils ( ) which ( ) libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) ( ) libpcp.so.3(PCP_3.11)(64bit) ( ) libpcp.so.3(PCP_3.14)(64bit) ( ) libpcp.so.3(PCP_3.3)(64bit) ( ) libpcp.so.3(PCP_3.37)(64bit) ( ) libpcp.so.3(PCP_3.6)(64bit) ( ) libpcp_gui.so.2()(64bit) ( ) libpcp_mmv.so.1()(64bit) ( ) libpcp_trace.so.2()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.6)(64bit) ( ) libpcp.so.3(PCP_3.13)(64bit) ( ) libpcp.so.3(PCP_3.16)(64bit) ( ) libpcp.so.3(PCP_3.28)(64bit) ( ) libpcp.so.3(PCP_3.31)(64bit) ( ) libpcp.so.3(PCP_3.34)(64bit) ( ) libpcp.so.3(PCP_3.36)(64bit) ( ) libpcp.so.3(PCP_3.4)(64bit) ( ) libpcp.so.3(PCP_3.7)(64bit) ( ) libpcp_archive.so.1()(64bit) ( ) libpcp_gui.so.2(PCP_GUI_2.0)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.2)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.0)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.3)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.10)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.5)(64bit) ( ) libpcp_trace.so.2(PCP_TRACE_2.0)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.2)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.4)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.8)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.9)(64bit) ( ) /usr/bin/hostname ( ) libpcp.so.3(PCP_3.10)(64bit) ( ) libpcp.so.3(PCP_3.12)(64bit) ( ) libpcp.so.3(PCP_3.15)(64bit) ( ) libpcp.so.3(PCP_3.18)(64bit) ( ) libpcp.so.3(PCP_3.19)(64bit) ( ) libpcp.so.3(PCP_3.20)(64bit) ( ) libpcp.so.3(PCP_3.24)(64bit) ( ) libpcp.so.3(PCP_3.25)(64bit) ( ) libpcp.so.3(PCP_3.27)(64bit) ( ) libpcp.so.3(PCP_3.29)(64bit) ( ) libpcp.so.3(PCP_3.30)(64bit) ( ) libpcp.so.3(PCP_3.32)(64bit) ( ) libpcp.so.3(PCP_3.33)(64bit) ( ) libpcp.so.3(PCP_3.35)(64bit) ( ) libpcp.so.3(PCP_3.39)(64bit) ( ) libpcp.so.3(PCP_3.40)(64bit) ( ) libpcp.so.3(PCP_3.42)(64bit) ( ) libpcp.so.3(PCP_3.5)(64bit) ( ) libpcp.so.3(PCP_3.9)(64bit) ( ) libpcp_archive.so.1(PCP_ARCHIVE_1.0)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.2)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.4)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.4)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.6)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.10)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.11)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.13)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.14)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.15)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.17)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.18)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.20)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.21)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.3)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.5)(64bit) ( ) /usr/bin/ps ( ) libpcp.so.3(PCP_3.43.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp-selinux ( if  selinux-policy-targeted)"
RPROVIDES:pcp = "group(pcp) ( ) pcp ( =  6.3.7-1.el10_0) user(pcp) ( =  dSBwY3AgLSAiUGVyZm9ybWFuY2UgQ28tUGlsb3QiIC92YXIvbGliL3BjcAAA) config(pcp) ( =  6.3.7-1.el10_0) pcp(x86-64) ( =  6.3.7-1.el10_0) pcp-pmda-kvm ( =  6.3.7-1.el10_0) pcp-webapi ( =  6.3.7-1.el10_0) pkgconfig(libpcp) ( =  6.3.7) pkgconfig(libpcp_archive) ( =  6.3.7) pkgconfig(libpcp_import) ( =  6.3.7) pkgconfig(libpcp_pmda) ( =  6.3.7)"

URI_pcp-conf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-conf-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-conf = ""
RPROVIDES:pcp-conf = "pcp-conf ( =  6.3.7-1.el10_0) config(pcp-conf) ( =  6.3.7-1.el10_0) pcp-conf(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-devel-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(vars) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) /usr/bin/pmpython ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libpcp.so.3(PCP_3.14)(64bit) ( ) libpcp.so.3(PCP_3.3)(64bit) ( ) perl(PCP::PMDA) ( ) libpcp.so.3(PCP_3.31)(64bit) ( ) libpcp.so.3(PCP_3.7)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.12)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.3)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) pcp-libs-devel ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-devel = "config(pcp-devel) ( =  6.3.7-1.el10_0) pcp-devel ( =  6.3.7-1.el10_0) pcp-devel(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-doc-6.3.7-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:pcp-doc = ""
RPROVIDES:pcp-doc = "pcp-doc ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2elasticsearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2elasticsearch-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2elasticsearch = "/usr/bin/pmpython ( ) python3-requests ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2elasticsearch = "pcp-export-pcp2elasticsearch ( =  6.3.7-1.el10_0) pcp-export-pcp2elasticsearch(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2graphite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2graphite-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2graphite = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2graphite = "pcp-export-pcp2graphite ( =  6.3.7-1.el10_0) pcp-export-pcp2graphite(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2influxdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2influxdb-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2influxdb = "/usr/bin/pmpython ( ) python3-requests ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2influxdb = "pcp-export-pcp2influxdb ( =  6.3.7-1.el10_0) pcp-export-pcp2influxdb(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2json-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2json = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2json = "pcp-export-pcp2json ( =  6.3.7-1.el10_0) pcp-export-pcp2json(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2openmetrics = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2openmetrics-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2openmetrics = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2openmetrics = "pcp-export-pcp2openmetrics ( =  6.3.7-1.el10_0) pcp-export-pcp2openmetrics(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2spark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2spark-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2spark = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2spark = "pcp-export-pcp2spark ( =  6.3.7-1.el10_0) pcp-export-pcp2spark(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2xml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2xml-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2xml = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2xml = "pcp-export-pcp2xml ( =  6.3.7-1.el10_0) pcp-export-pcp2xml(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-pcp2zabbix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-pcp2zabbix-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-pcp2zabbix = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-pcp2zabbix = "pcp-export-pcp2zabbix ( =  6.3.7-1.el10_0) pcp-export-pcp2zabbix(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-export-zabbix-agent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-export-zabbix-agent-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-export-zabbix-agent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.13)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-export-zabbix-agent = "config(pcp-export-zabbix-agent) ( =  6.3.7-1.el10_0) pcp-export-zabbix-agent ( =  6.3.7-1.el10_0) pcp-export-zabbix-agent(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-geolocate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-geolocate-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-geolocate = "/usr/bin/pmpython ( ) python3-pcp ( =  6.3.7-1.el10_0) pcp-libs ( >=  6.3.7-1.el10_0)"
RPROVIDES:pcp-geolocate = "pcp-geolocate ( =  6.3.7-1.el10_0) pcp-geolocate(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-gui-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-gui = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libQt6PrintSupport.so.6()(64bit) ( ) libQt6PrintSupport.so.6(Qt_6)(64bit) ( ) libQt6Svg.so.6()(64bit) ( ) libQt6Svg.so.6(Qt_6)(64bit) ( ) liberation-sans-fonts ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-gui = "application() ( ) application(pmchart.desktop) ( ) config(pcp-gui) ( =  6.3.7-1.el10_0) pcp-gui ( =  6.3.7-1.el10_0) pcp-gui(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-import-collectl2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-collectl2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-collectl2pcp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libpcp_import.so.1()(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-import-collectl2pcp = "pcp-import-collectl2pcp ( =  6.3.7-1.el10_0) pcp-import-collectl2pcp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-import-ganglia2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-ganglia2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-ganglia2pcp = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Getopt::Std) ( ) perl(Date::Format) ( ) perl(PCP::LogImport) ( ) perl(Date::Parse) ( ) perl(RRDs) ( ) pcp-libs ( =  6.3.7-1.el10_0) perl-PCP-LogImport ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-import-ganglia2pcp = "pcp-import-ganglia2pcp ( =  6.3.7-1.el10_0) pcp-import-ganglia2pcp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-import-iostat2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-iostat2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-iostat2pcp = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(Getopt::Std) ( ) perl(Date::Format) ( ) perl(PCP::LogImport) ( ) perl(Date::Parse) ( ) pcp-libs ( =  6.3.7-1.el10_0) perl-PCP-LogImport ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-import-iostat2pcp = "pcp-import-iostat2pcp ( =  6.3.7-1.el10_0) pcp-import-iostat2pcp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-import-mrtg2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-mrtg2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-mrtg2pcp = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(PCP::LogImport) ( ) pcp-libs ( =  6.3.7-1.el10_0) perl-PCP-LogImport ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-import-mrtg2pcp = "pcp-import-mrtg2pcp ( =  6.3.7-1.el10_0) pcp-import-mrtg2pcp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-import-sar2pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-import-sar2pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-import-sar2pcp = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(Date::Format) ( ) perl(PCP::LogImport) ( ) perl(Date::Parse) ( ) perl(XML::TokeParser) ( ) pcp-libs ( =  6.3.7-1.el10_0) perl-PCP-LogImport ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-import-sar2pcp = "pcp-import-sar2pcp ( =  6.3.7-1.el10_0) pcp-import-sar2pcp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-libs-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libsasl2.so.3()(64bit) ( ) libuv.so.1()(64bit) ( ) pcp-conf ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-libs = "libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libpcp_import.so.1()(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) ( ) libpcp.so.3(PCP_3.11)(64bit) ( ) libpcp.so.3(PCP_3.14)(64bit) ( ) libpcp.so.3(PCP_3.3)(64bit) ( ) libpcp.so.3(PCP_3.37)(64bit) ( ) libpcp.so.3(PCP_3.6)(64bit) ( ) libpcp_gui.so.2()(64bit) ( ) libpcp_mmv.so.1()(64bit) ( ) libpcp_trace.so.2()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.1)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.6)(64bit) ( ) libpcp.so.3(PCP_3.13)(64bit) ( ) libpcp.so.3(PCP_3.16)(64bit) ( ) libpcp.so.3(PCP_3.28)(64bit) ( ) libpcp.so.3(PCP_3.31)(64bit) ( ) libpcp.so.3(PCP_3.34)(64bit) ( ) libpcp.so.3(PCP_3.36)(64bit) ( ) libpcp.so.3(PCP_3.4)(64bit) ( ) libpcp.so.3(PCP_3.7)(64bit) ( ) libpcp_archive.so.1()(64bit) ( ) libpcp_gui.so.2(PCP_GUI_2.0)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.1)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.2)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.0)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.3)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.10)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.5)(64bit) ( ) libpcp_trace.so.2(PCP_TRACE_2.0)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.2)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.4)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.7)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.8)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.9)(64bit) ( ) libpcp.so.3(PCP_3.10)(64bit) ( ) libpcp.so.3(PCP_3.12)(64bit) ( ) libpcp.so.3(PCP_3.15)(64bit) ( ) libpcp.so.3(PCP_3.17)(64bit) ( ) libpcp.so.3(PCP_3.18)(64bit) ( ) libpcp.so.3(PCP_3.19)(64bit) ( ) libpcp.so.3(PCP_3.20)(64bit) ( ) libpcp.so.3(PCP_3.24)(64bit) ( ) libpcp.so.3(PCP_3.25)(64bit) ( ) libpcp.so.3(PCP_3.27)(64bit) ( ) libpcp.so.3(PCP_3.29)(64bit) ( ) libpcp.so.3(PCP_3.30)(64bit) ( ) libpcp.so.3(PCP_3.32)(64bit) ( ) libpcp.so.3(PCP_3.33)(64bit) ( ) libpcp.so.3(PCP_3.35)(64bit) ( ) libpcp.so.3(PCP_3.39)(64bit) ( ) libpcp.so.3(PCP_3.40)(64bit) ( ) libpcp.so.3(PCP_3.41)(64bit) ( ) libpcp.so.3(PCP_3.42)(64bit) ( ) libpcp.so.3(PCP_3.5)(64bit) ( ) libpcp.so.3(PCP_3.9)(64bit) ( ) libpcp_archive.so.1(PCP_ARCHIVE_1.0)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.3)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.2)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.4)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.11)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.12)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.3)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.4)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.6)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.8)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.10)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.11)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.13)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.14)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.15)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.17)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.18)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.19)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.20)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.21)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.3)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.5)(64bit) ( ) libpcp.so.3(PCP_3.1)(64bit) ( ) libpcp.so.3(PCP_3.23)(64bit) ( ) libpcp.so.3(PCP_3.26)(64bit) ( ) libpcp.so.3(PCP_3.38)(64bit) ( ) libpcp.so.3(PCP_3.43.1)(64bit) ( ) libpcp.so.3(PCP_3.8)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.2)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.0)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.12)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.16)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp-libs(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-libs-devel-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-libs-devel = "libpcp.so.3()(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp_import.so.1()(64bit) ( ) libpcp_gui.so.2()(64bit) ( ) libpcp_mmv.so.1()(64bit) ( ) libpcp_trace.so.2()(64bit) ( ) libpcp_archive.so.1()(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-libs-devel = "pcp-libs-devel ( =  6.3.7-1.el10_0) pcp-libs-devel(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-activemq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-activemq-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-activemq = "/bin/sh ( ) /usr/bin/sh ( ) perl(strict) ( ) perl(Time::HiRes) ( ) perl(Digest::MD5) ( ) perl(LWP::UserAgent) ( ) perl(JSON) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-activemq = "perl(PCP::ActiveMQ) ( ) perl(PCP::Cache) ( ) perl(PCP::JVMGarbageCollection) ( ) perl(PCP::JVMMemory) ( ) perl(PCP::JVMMemoryPool) ( ) perl(PCP::Queue) ( ) perl(PCP::RESTClient) ( ) perl(PCP::TimeSource) ( ) pcp-pmda-activemq ( =  6.3.7-1.el10_0) pcp-pmda-activemq(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-amdgpu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-amdgpu-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-amdgpu = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libdrm.so.2()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libdrm_amdgpu.so.1()(64bit) ( ) libdrm ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-amdgpu = "pcp-pmda-amdgpu ( =  6.3.7-1.el10_0) pcp-pmda-amdgpu(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-apache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-apache-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-apache = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-apache = "pcp-pmda-apache ( =  6.3.7-1.el10_0) pcp-pmda-apache(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-bash = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bash-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bash = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-bash = "pcp-pmda-bash ( =  6.3.7-1.el10_0) pcp-pmda-bash(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-bcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bcc-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bcc = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-bcc ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-bcc = "config(pcp-pmda-bcc) ( =  6.3.7-1.el10_0) pcp-pmda-bcc ( =  6.3.7-1.el10_0) pcp-pmda-bcc(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-bind2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bind2-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bind2 = "/bin/sh ( ) /usr/bin/sh ( ) perl-Time-HiRes ( ) perl(LWP::UserAgent) ( ) perl-autodie ( ) perl(XML::LibXML) ( ) perl(File::Slurp) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-bind2 = "config(pcp-pmda-bind2) ( =  6.3.7-1.el10_0) pcp-pmda-bind2 ( =  6.3.7-1.el10_0) pcp-pmda-bind2(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-bonding = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bonding-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bonding = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-bonding = "pcp-pmda-bonding ( =  6.3.7-1.el10_0) pcp-pmda-bonding(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-bpf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bpf-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bpf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libbpf.so.1()(64bit) ( ) libbpf.so.1(LIBBPF_0.0.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.7)(64bit) ( ) libbpf.so.1(LIBBPF_0.1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.8)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.9)(64bit) ( ) libbpf.so.1(LIBBPF_0.6.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.5.0)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.4)(64bit) ( ) libbpf.so.1(LIBBPF_0.2.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libbpf.so.1(LIBBPF_0.8.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.6)(64bit) ( ) libbpf.so.1(LIBBPF_0.0.2)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.5)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.4)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.7)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.8)(64bit) ( ) libbpf ( ) libpcp_web.so.1(PCP_WEB_1.19)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-bpf = "config(pcp-pmda-bpf) ( =  6.3.7-1.el10_0) pcp-pmda-bpf ( =  6.3.7-1.el10_0) pcp-pmda-bpf(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-bpftrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-bpftrace-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-bpftrace = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) bpftrace ( >=  0.9.2) python3 ( >=  3.6)"
RPROVIDES:pcp-pmda-bpftrace = "config(pcp-pmda-bpftrace) ( =  6.3.7-1.el10_0) pcp-pmda-bpftrace ( =  6.3.7-1.el10_0) pcp-pmda-bpftrace(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-cifs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-cifs-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-cifs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-cifs = "pcp-pmda-cifs ( =  6.3.7-1.el10_0) pcp-pmda-cifs(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-cisco = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-cisco-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-cisco = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp.so.3(PCP_3.4)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-cisco = "pcp-pmda-cisco ( =  6.3.7-1.el10_0) pcp-pmda-cisco(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-dbping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-dbping-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-dbping = "/bin/sh ( ) /usr/bin/sh ( ) perl-DBI ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-dbping = "pcp-pmda-dbping ( =  6.3.7-1.el10_0) pcp-pmda-dbping(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-denki = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-denki-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-denki = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-denki = "pcp-pmda-denki ( =  6.3.7-1.el10_0) pcp-pmda-denki(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-dm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-dm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-dm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libdevmapper.so.1.02()(64bit) ( ) libdevmapper.so.1.02(Base)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_197)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_104)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_107)(64bit) ( ) libdevmapper.so.1.02(DM_1_02_129)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-dm = "pcp-pmda-dm ( =  6.3.7-1.el10_0) config(pcp-pmda-dm) ( =  6.3.7-1.el10_0) pcp-pmda-dm(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-docker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-docker-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-docker = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.1)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.2)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-docker = "pcp-pmda-docker ( =  6.3.7-1.el10_0) pcp-pmda-docker(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-ds389 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-ds389-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-ds389 = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-ds389 = "pcp-pmda-ds389 ( =  6.3.7-1.el10_0) pcp-pmda-ds389(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-ds389log = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-ds389log-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-ds389log = "/bin/sh ( ) /usr/bin/sh ( ) perl-Date-Manip ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-ds389log = "pcp-pmda-ds389log ( =  6.3.7-1.el10_0) pcp-pmda-ds389log(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-elasticsearch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-elasticsearch-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-elasticsearch = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-elasticsearch = "config(pcp-pmda-elasticsearch) ( =  6.3.7-1.el10_0) pcp-pmda-elasticsearch ( =  6.3.7-1.el10_0) pcp-pmda-elasticsearch(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-farm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-farm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-farm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) smartmontools ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-farm = "pcp-pmda-farm ( =  6.3.7-1.el10_0) pcp-pmda-farm(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-gluster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-gluster-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-gluster = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-gluster = "pcp-pmda-gluster ( =  6.3.7-1.el10_0) pcp-pmda-gluster(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-gpfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-gpfs-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-gpfs = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-gpfs = "pcp-pmda-gpfs ( =  6.3.7-1.el10_0) pcp-pmda-gpfs(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-gpsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-gpsd-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-gpsd = "/bin/sh ( ) /usr/bin/sh ( ) perl-Time-HiRes ( ) perl-JSON ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-gpsd = "pcp-pmda-gpsd ( =  6.3.7-1.el10_0) pcp-pmda-gpsd(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-hacluster = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-hacluster-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-hacluster = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-hacluster = "pcp-pmda-hacluster ( =  6.3.7-1.el10_0) pcp-pmda-hacluster(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-haproxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-haproxy-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-haproxy = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-haproxy = "config(pcp-pmda-haproxy) ( =  6.3.7-1.el10_0) pcp-pmda-haproxy ( =  6.3.7-1.el10_0) pcp-pmda-haproxy(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-infiniband = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-infiniband-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-infiniband = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libibmad.so.5()(64bit) ( ) libibumad.so.3()(64bit) ( ) libibmad.so.5(IBMAD_1.3)(64bit) ( ) libibumad.so.3(IBUMAD_1.0)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) libibmad ( >=  1.3.7) libibumad ( >=  1.3.7)"
RPROVIDES:pcp-pmda-infiniband = "pcp-pmda-infiniband ( =  6.3.7-1.el10_0) pcp-pmda-infiniband(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-json = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-json-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-json = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-six ( ) python3-jsonpointer ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-json = "config(pcp-pmda-json) ( =  6.3.7-1.el10_0) pcp-pmda-json ( =  6.3.7-1.el10_0) pcp-pmda-json(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-libvirt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-libvirt-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-libvirt = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-lxml ( ) libvirt-python3 ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-libvirt = "config(pcp-pmda-libvirt) ( =  6.3.7-1.el10_0) pcp-pmda-libvirt ( =  6.3.7-1.el10_0) pcp-pmda-libvirt(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-lio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lio-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lio = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-rtslib ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-lio = "pcp-pmda-lio ( =  6.3.7-1.el10_0) pcp-pmda-lio(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-lmsensors = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lmsensors-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lmsensors = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) lm_sensors ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-lmsensors = "pcp-pmda-lmsensors ( =  6.3.7-1.el10_0) pcp-pmda-lmsensors(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-logger = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-logger-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-logger = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-logger = "pcp-pmda-logger ( =  6.3.7-1.el10_0) pcp-pmda-logger(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-lustre = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lustre-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lustre = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-lustre = "config(pcp-pmda-lustre) ( =  6.3.7-1.el10_0) pcp-pmda-lustre ( =  6.3.7-1.el10_0) pcp-pmda-lustre(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-lustrecomm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-lustrecomm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-lustrecomm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-lustrecomm = "pcp-pmda-lustrecomm ( =  6.3.7-1.el10_0) pcp-pmda-lustrecomm(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-mailq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mailq-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mailq = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-mailq = "pcp-pmda-mailq ( =  6.3.7-1.el10_0) pcp-pmda-mailq(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-memcache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-memcache-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-memcache = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-memcache = "pcp-pmda-memcache ( =  6.3.7-1.el10_0) pcp-pmda-memcache(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-mic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mic-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mic = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-mic = "pcp-pmda-mic ( =  6.3.7-1.el10_0) pcp-pmda-mic(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-mongodb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mongodb-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mongodb = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-mongodb = "config(pcp-pmda-mongodb) ( =  6.3.7-1.el10_0) pcp-pmda-mongodb ( =  6.3.7-1.el10_0) pcp-pmda-mongodb(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-mounts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mounts-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mounts = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-mounts = "config(pcp-pmda-mounts) ( =  6.3.7-1.el10_0) pcp-pmda-mounts ( =  6.3.7-1.el10_0) pcp-pmda-mounts(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-mssql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mssql-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mssql = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-pyodbc ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-mssql = "config(pcp-pmda-mssql) ( =  6.3.7-1.el10_0) pcp-pmda-mssql ( =  6.3.7-1.el10_0) pcp-pmda-mssql(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-mysql-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-mysql = "/bin/sh ( ) /usr/bin/sh ( ) perl(DBI) ( ) perl(DBD::mysql) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-mysql = "pcp-pmda-mysql ( =  6.3.7-1.el10_0) pcp-pmda-mysql(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-named = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-named-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-named = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-named = "pcp-pmda-named ( =  6.3.7-1.el10_0) pcp-pmda-named(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-netcheck = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-netcheck-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-netcheck = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-netcheck = "config(pcp-pmda-netcheck) ( =  6.3.7-1.el10_0) pcp-pmda-netcheck ( =  6.3.7-1.el10_0) pcp-pmda-netcheck(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-netfilter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-netfilter-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-netfilter = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-netfilter = "pcp-pmda-netfilter ( =  6.3.7-1.el10_0) pcp-pmda-netfilter(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-news = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-news-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-news = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-news = "pcp-pmda-news ( =  6.3.7-1.el10_0) pcp-pmda-news(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-nfsclient = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-nfsclient-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-nfsclient = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-nfsclient = "pcp-pmda-nfsclient ( =  6.3.7-1.el10_0) pcp-pmda-nfsclient(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-nginx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-nginx-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-nginx = "/bin/sh ( ) /usr/bin/sh ( ) perl(LWP::UserAgent) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-nginx = "config(pcp-pmda-nginx) ( =  6.3.7-1.el10_0) pcp-pmda-nginx ( =  6.3.7-1.el10_0) pcp-pmda-nginx(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-nvidia-gpu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-nvidia-gpu-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-nvidia-gpu = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-nvidia-gpu = "pcp-pmda-nvidia-gpu ( =  6.3.7-1.el10_0) pcp-pmda-nvidia-gpu(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-openmetrics = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-openmetrics-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-openmetrics = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-requests ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-openmetrics = "pcp-pmda-prometheus ( <  5.0.0) pcp-pmda-openmetrics ( =  6.3.7-1.el10_0) config(pcp-pmda-openmetrics) ( =  6.3.7-1.el10_0) pcp-pmda-openmetrics(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-openvswitch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-openvswitch-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-openvswitch = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-openvswitch = "config(pcp-pmda-openvswitch) ( =  6.3.7-1.el10_0) pcp-pmda-openvswitch ( =  6.3.7-1.el10_0) pcp-pmda-openvswitch(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-oracle = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-oracle-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-oracle = "/bin/sh ( ) /usr/bin/sh ( ) perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(DBI) ( ) perl(PCP::PMDA) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-oracle = "config(pcp-pmda-oracle) ( =  6.3.7-1.el10_0) pcp-pmda-oracle ( =  6.3.7-1.el10_0) pcp-pmda-oracle(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-pdns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-pdns-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-pdns = "/bin/sh ( ) /usr/bin/sh ( ) perl-Time-HiRes ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-pdns = "pcp-pmda-pdns ( =  6.3.7-1.el10_0) pcp-pmda-pdns(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-perfevent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-perfevent-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-perfevent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) perl(strict) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) perl(warnings) ( ) /usr/bin/perl ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpfm.so.4()(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) libpfm ( >=  4)"
RPROVIDES:pcp-pmda-perfevent = "config(pcp-pmda-perfevent) ( =  6.3.7-1.el10_0) pcp-pmda-perfevent ( =  6.3.7-1.el10_0) pcp-pmda-perfevent(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-podman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-podman-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-podman = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-podman = "pcp-pmda-podman ( =  6.3.7-1.el10_0) pcp-pmda-podman(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-postfix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-postfix-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-postfix = "/bin/sh ( ) /usr/bin/sh ( ) perl-Time-HiRes ( ) postfix-perl-scripts ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-postfix = "pcp-pmda-postfix ( =  6.3.7-1.el10_0) pcp-pmda-postfix(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-postgresql-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-postgresql = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) python3-psycopg2 ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-postgresql = "config(pcp-pmda-postgresql) ( =  6.3.7-1.el10_0) pcp-pmda-postgresql ( =  6.3.7-1.el10_0) pcp-pmda-postgresql(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-rabbitmq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-rabbitmq-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-rabbitmq = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-rabbitmq = "config(pcp-pmda-rabbitmq) ( =  6.3.7-1.el10_0) pcp-pmda-rabbitmq ( =  6.3.7-1.el10_0) pcp-pmda-rabbitmq(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-redis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-redis-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-redis = "/bin/sh ( ) /usr/bin/sh ( ) perl-Time-HiRes ( ) perl-autodie ( ) perl-Data-Dumper ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-redis = "config(pcp-pmda-redis) ( =  6.3.7-1.el10_0) pcp-pmda-redis ( =  6.3.7-1.el10_0) pcp-pmda-redis(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-resctrl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-resctrl-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-resctrl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp.so.3(PCP_3.11)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-resctrl = "pcp-pmda-resctrl ( =  6.3.7-1.el10_0) pcp-pmda-resctrl(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-roomtemp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-roomtemp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-roomtemp = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-roomtemp = "pcp-pmda-roomtemp ( =  6.3.7-1.el10_0) pcp-pmda-roomtemp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-rsyslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-rsyslog-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-rsyslog = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-rsyslog = "pcp-pmda-rsyslog ( =  6.3.7-1.el10_0) pcp-pmda-rsyslog(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-samba = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-samba-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-samba = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-samba = "pcp-pmda-samba ( =  6.3.7-1.el10_0) pcp-pmda-samba(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-sendmail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-sendmail-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-sendmail = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-sendmail = "pcp-pmda-sendmail ( =  6.3.7-1.el10_0) pcp-pmda-sendmail(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-shping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-shping-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-shping = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-shping = "config(pcp-pmda-shping) ( =  6.3.7-1.el10_0) pcp-pmda-shping ( =  6.3.7-1.el10_0) pcp-pmda-shping(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-slurm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-slurm-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-slurm = "/usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-slurm = "pcp-pmda-slurm ( =  6.3.7-1.el10_0) pcp-pmda-slurm(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-smart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-smart-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-smart = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) smartmontools ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-smart = "pcp-pmda-smart ( =  6.3.7-1.el10_0) pcp-pmda-smart(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-snmp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-snmp = "/bin/sh ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-snmp = "config(pcp-pmda-snmp) ( =  6.3.7-1.el10_0) pcp-pmda-snmp ( =  6.3.7-1.el10_0) pcp-pmda-snmp(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-sockets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-sockets-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-sockets = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) iproute ( ) libpcp.so.3(PCP_3.41)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.11)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-sockets = "config(pcp-pmda-sockets) ( =  6.3.7-1.el10_0) pcp-pmda-sockets ( =  6.3.7-1.el10_0) pcp-pmda-sockets(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-statsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-statsd-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-statsd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpcp_web.so.1()(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.6)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.10)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.7)(64bit) ( ) libpcp_web.so.1(PCP_WEB_1.9)(64bit) ( ) HdrHistogram_c ( ) chan ( ) libchan.so.0()(64bit) ( ) libhdr_histogram.so.6()(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-statsd = "config(pcp-pmda-statsd) ( =  6.3.7-1.el10_0) pcp-pmda-statsd ( =  6.3.7-1.el10_0) pcp-pmda-statsd(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-summary = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-summary-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-summary = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp.so.3(PCP_3.37)(64bit) ( ) libpcp.so.3(PCP_3.34)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-summary = "config(pcp-pmda-summary) ( =  6.3.7-1.el10_0) pcp-pmda-summary ( =  6.3.7-1.el10_0) pcp-pmda-summary(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-systemd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-systemd-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-systemd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-systemd = "pcp-pmda-systemd ( =  6.3.7-1.el10_0) pcp-pmda-systemd(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-trace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-trace-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-trace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_trace.so.2()(64bit) ( ) libpcp.so.3(PCP_3.36)(64bit) ( ) libpcp_trace.so.2(PCP_TRACE_2.0)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-trace = "pcp-pmda-trace ( =  6.3.7-1.el10_0) pcp-pmda-trace(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-unbound-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-unbound = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-unbound = "pcp-pmda-unbound ( =  6.3.7-1.el10_0) pcp-pmda-unbound(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-uwsgi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-uwsgi-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-uwsgi = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-uwsgi = "config(pcp-pmda-uwsgi) ( =  6.3.7-1.el10_0) pcp-pmda-uwsgi ( =  6.3.7-1.el10_0) pcp-pmda-uwsgi(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-weblog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-weblog-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-weblog = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-weblog = "pcp-pmda-weblog ( =  6.3.7-1.el10_0) pcp-pmda-weblog(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-zimbra = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-zimbra-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-zimbra = "rtld(GNU_HASH) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) perl-PCP-PMDA ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-zimbra = "pcp-pmda-zimbra ( =  6.3.7-1.el10_0) pcp-pmda-zimbra(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-pmda-zswap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-pmda-zswap-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-pmda-zswap = "/bin/sh ( ) /usr/bin/sh ( ) /usr/bin/pmpython ( ) python3-pcp ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-pmda-zswap = "pcp-pmda-zswap ( =  6.3.7-1.el10_0) pcp-pmda-zswap(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-selinux-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( )"
RPROVIDES:pcp-selinux = "pcp-selinux ( =  6.3.7-1.el10_0) pcp-selinux(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-system-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-system-tools-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-system-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/bash ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) /usr/bin/pmpython ( ) libtinfo.so.6()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libpcp.so.3(PCP_3.11)(64bit) ( ) libpcp.so.3(PCP_3.14)(64bit) ( ) libpcp.so.3(PCP_3.3)(64bit) ( ) libpcp.so.3(PCP_3.6)(64bit) ( ) libpcp_gui.so.2()(64bit) ( ) libpcp.so.3(PCP_3.28)(64bit) ( ) libpcp_gui.so.2(PCP_GUI_2.0)(64bit) ( ) libpcp.so.3(PCP_3.17)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) python3-pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-system-tools = "/usr/bin/dstat ( ) pcp-system-tools ( =  6.3.7-1.el10_0) config(pcp-system-tools) ( =  6.3.7-1.el10_0) dstat ( =  6.3.7-1.el10_0) pcp-system-tools(x86-64) ( =  6.3.7-1.el10_0)"

URI_pcp-zeroconf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcp-zeroconf-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-zeroconf = "/bin/sh ( ) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0) pcp-doc ( =  6.3.7-1.el10_0) pcp-pmda-dm ( =  6.3.7-1.el10_0) pcp-pmda-nfsclient ( =  6.3.7-1.el10_0) pcp-pmda-openmetrics ( =  6.3.7-1.el10_0) pcp-system-tools ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-zeroconf = "config(pcp-zeroconf) ( =  6.3.7-1.el10_0) pcp-zeroconf ( =  6.3.7-1.el10_0) pcp-zeroconf(x86-64) ( =  6.3.7-1.el10_0)"

URI_perl-PCP-LogImport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-LogImport-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-LogImport = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) perl-interpreter ( ) perl(:MODULE_COMPAT_5.40.2) ( ) perl(DynaLoader) ( ) libpcp_import.so.1()(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.1)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.2)(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.3)(64bit) ( ) pcp-libs ( =  6.3.7-1.el10_0)"
RPROVIDES:perl-PCP-LogImport = "perl-PCP-LogImport ( =  6.3.7-1.el10_0) perl(PCP::LogImport) ( =  1.02) perl-PCP-LogImport(x86-64) ( =  6.3.7-1.el10_0)"

URI_perl-PCP-LogSummary = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-LogSummary-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-LogSummary = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl-interpreter ( ) perl(PCP::LogSummary) ( ) pcp-libs ( =  6.3.7-1.el10_0)"
RPROVIDES:perl-PCP-LogSummary = "perl(PCP::LogSummary) ( =  1.01) perl-PCP-LogSummary ( =  6.3.7-1.el10_0) perl-PCP-LogSummary(x86-64) ( =  6.3.7-1.el10_0)"

URI_perl-PCP-MMV = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-MMV-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-MMV = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl-interpreter ( ) perl(:MODULE_COMPAT_5.40.2) ( ) perl(DynaLoader) ( ) perl(Time::HiRes) ( ) libpcp_mmv.so.1()(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.0)(64bit) ( ) libpcp_mmv.so.1(PCP_MMV_1.3)(64bit) ( ) perl(PCP::MMV) ( ) pcp-libs ( =  6.3.7-1.el10_0)"
RPROVIDES:perl-PCP-MMV = "perl(PCP::MMV) ( =  1.00) perl-PCP-MMV ( =  6.3.7-1.el10_0) perl-PCP-MMV(x86-64) ( =  6.3.7-1.el10_0)"

URI_perl-PCP-PMDA = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PCP-PMDA-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PCP-PMDA = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) perl-interpreter ( ) perl(:MODULE_COMPAT_5.40.2) ( ) perl(DynaLoader) ( ) pcp-libs ( =  6.3.7-1.el10_0)"
RPROVIDES:perl-PCP-PMDA = "perl-PCP-PMDA ( =  6.3.7-1.el10_0) perl(PCP::PMDA) ( =  1.17) perl-PCP-PMDA(x86-64) ( =  6.3.7-1.el10_0)"

URI_python3-pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pcp-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pcp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) python3 ( ) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) ( ) libpcp.so.3(PCP_3.2)(64bit) ( ) libpcp.so.3(PCP_3.37)(64bit) ( ) libpcp.so.3(PCP_3.6)(64bit) ( ) libpcp.so.3(PCP_3.16)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.8)(64bit) ( ) python(abi) ( =  3.12) pcp-libs ( =  6.3.7-1.el10_0) pcp ( =  6.3.7-1.el10_0)"
RPROVIDES:python3-pcp = "python3-pcp ( =  6.3.7-1.el10_0) python3.12dist(pcp) ( =  5) python3dist(pcp) ( =  5) python-pcp ( =  6.3.7-1.el10_0) python3-pcp(x86-64) ( =  6.3.7-1.el10_0) python3.12-pcp ( =  6.3.7-1.el10_0)"

URI_pcp-testsuite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pcp-testsuite-6.3.7-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcp-testsuite = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) perl(strict) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/sh ( ) perl(warnings) ( ) perl(Exporter) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/perl ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) perl(Getopt::Long) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) gcc ( ) libavahi-client.so.3()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) redhat-rpm-config ( ) libsystemd.so.0()(64bit) ( ) perl(Getopt::Std) ( ) perl(IO::Socket) ( ) gzip ( ) libsasl2.so.3()(64bit) ( ) /usr/bin/pmpython ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) bc ( ) bzip2 ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.0)(64bit) ( ) libpcp.so.3(PCP_3.21)(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) libpcp_pmda.so.3()(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) ( ) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) ( ) pcp-export-pcp2json ( ) pcp-export-pcp2openmetrics ( ) pcp-export-pcp2spark ( ) pcp-export-pcp2xml ( ) pcp-export-pcp2zabbix ( ) pcp-geolocate ( ) pcp-gui ( ) pcp-pmda-activemq ( ) pcp-pmda-amdgpu ( ) pcp-pmda-apache ( ) pcp-pmda-bash ( ) pcp-pmda-bcc ( ) pcp-pmda-bind2 ( ) pcp-pmda-bonding ( ) pcp-pmda-bpf ( ) pcp-pmda-bpftrace ( ) pcp-pmda-cisco ( ) pcp-pmda-dbping ( ) pcp-pmda-denki ( ) pcp-pmda-dm ( ) pcp-pmda-docker ( ) pcp-pmda-ds389 ( ) pcp-pmda-ds389log ( ) pcp-pmda-elasticsearch ( ) pcp-pmda-farm ( ) pcp-pmda-gluster ( ) pcp-pmda-gpfs ( ) pcp-pmda-gpsd ( ) pcp-pmda-hacluster ( ) pcp-pmda-haproxy ( ) pcp-pmda-json ( ) pcp-pmda-libvirt ( ) pcp-pmda-lio ( ) pcp-pmda-lmsensors ( ) pcp-pmda-logger ( ) pcp-pmda-lustre ( ) pcp-pmda-lustrecomm ( ) pcp-pmda-mailq ( ) pcp-pmda-memcache ( ) pcp-pmda-mic ( ) pcp-pmda-mongodb ( ) pcp-pmda-mounts ( ) pcp-pmda-mssql ( ) pcp-pmda-mysql ( ) pcp-pmda-named ( ) pcp-pmda-netcheck ( ) pcp-pmda-netfilter ( ) pcp-pmda-news ( ) pcp-pmda-nfsclient ( ) pcp-pmda-nginx ( ) pcp-pmda-nvidia-gpu ( ) pcp-pmda-openmetrics ( ) pcp-pmda-openvswitch ( ) pcp-pmda-oracle ( ) pcp-pmda-pdns ( ) pcp-pmda-podman ( ) pcp-pmda-postfix ( ) pcp-pmda-postgresql ( ) pcp-pmda-rabbitmq ( ) pcp-pmda-resctrl ( ) pcp-pmda-roomtemp ( ) pcp-pmda-samba ( ) pcp-pmda-sendmail ( ) pcp-pmda-shping ( ) pcp-pmda-slurm ( ) pcp-pmda-smart ( ) pcp-pmda-snmp ( ) pcp-pmda-sockets ( ) pcp-pmda-statsd ( ) pcp-pmda-summary ( ) pcp-pmda-trace ( ) pcp-pmda-unbound ( ) pcp-pmda-uwsgi ( ) pcp-pmda-weblog ( ) pcp-pmda-zimbra ( ) pcp-pmda-zswap ( ) pcp-system-tools ( ) perl(Date::Format) ( ) perl(Date::Parse) ( ) perl(Net::Domain) ( ) perl(PCP::LogImport) ( ) selinux-policy-devel ( ) selinux-policy-targeted ( ) setools-console ( ) pcp ( =  6.3.7-1.el10_0) pcp-libs ( =  6.3.7-1.el10_0) pcp-devel ( =  6.3.7-1.el10_0) pcp-libs-devel ( =  6.3.7-1.el10_0)"
RPROVIDES:pcp-testsuite = "group(pcpqa) ( ) libpcp_fault.so.3()(64bit) ( ) libpcp_fault.so.3(PCP_3.0)(64bit) ( ) libpcp_fault.so.3(PCP_3.1)(64bit) ( ) libpcp_fault.so.3(PCP_3.10)(64bit) ( ) libpcp_fault.so.3(PCP_3.11)(64bit) ( ) libpcp_fault.so.3(PCP_3.12)(64bit) ( ) libpcp_fault.so.3(PCP_3.13)(64bit) ( ) libpcp_fault.so.3(PCP_3.14)(64bit) ( ) libpcp_fault.so.3(PCP_3.15)(64bit) ( ) libpcp_fault.so.3(PCP_3.16)(64bit) ( ) libpcp_fault.so.3(PCP_3.17)(64bit) ( ) libpcp_fault.so.3(PCP_3.18)(64bit) ( ) libpcp_fault.so.3(PCP_3.19)(64bit) ( ) libpcp_fault.so.3(PCP_3.2)(64bit) ( ) libpcp_fault.so.3(PCP_3.20)(64bit) ( ) libpcp_fault.so.3(PCP_3.21)(64bit) ( ) libpcp_fault.so.3(PCP_3.22)(64bit) ( ) libpcp_fault.so.3(PCP_3.23)(64bit) ( ) libpcp_fault.so.3(PCP_3.24)(64bit) ( ) libpcp_fault.so.3(PCP_3.25)(64bit) ( ) libpcp_fault.so.3(PCP_3.26)(64bit) ( ) libpcp_fault.so.3(PCP_3.27)(64bit) ( ) libpcp_fault.so.3(PCP_3.28)(64bit) ( ) libpcp_fault.so.3(PCP_3.29)(64bit) ( ) libpcp_fault.so.3(PCP_3.3)(64bit) ( ) libpcp_fault.so.3(PCP_3.30)(64bit) ( ) libpcp_fault.so.3(PCP_3.31)(64bit) ( ) libpcp_fault.so.3(PCP_3.32)(64bit) ( ) libpcp_fault.so.3(PCP_3.33)(64bit) ( ) libpcp_fault.so.3(PCP_3.34)(64bit) ( ) libpcp_fault.so.3(PCP_3.35)(64bit) ( ) libpcp_fault.so.3(PCP_3.36)(64bit) ( ) libpcp_fault.so.3(PCP_3.37)(64bit) ( ) libpcp_fault.so.3(PCP_3.38)(64bit) ( ) libpcp_fault.so.3(PCP_3.39)(64bit) ( ) libpcp_fault.so.3(PCP_3.4)(64bit) ( ) libpcp_fault.so.3(PCP_3.40)(64bit) ( ) libpcp_fault.so.3(PCP_3.41)(64bit) ( ) libpcp_fault.so.3(PCP_3.42)(64bit) ( ) libpcp_fault.so.3(PCP_3.5)(64bit) ( ) libpcp_fault.so.3(PCP_3.6)(64bit) ( ) libpcp_fault.so.3(PCP_3.7)(64bit) ( ) libpcp_fault.so.3(PCP_3.8)(64bit) ( ) libpcp_fault.so.3(PCP_3.9)(64bit) ( ) perl(Slurm) ( ) perl(Slurm::Hostlist) ( ) libpcp_fault.so.3(PCP_3.43.1)(64bit) ( ) user(pcpqa) ( =  dSBwY3BxYSAtICJQQ1AgUXVhbGl0eSBBc3N1cmFuY2UiIC92YXIvbGliL3BjcC90ZXN0c3VpdGUgL2Jpbi9iYXNo) pcp-testsuite ( =  6.3.7-1.el10_0) pcp-testsuite(x86-64) ( =  6.3.7-1.el10_0)"

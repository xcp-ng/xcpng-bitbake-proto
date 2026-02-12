
inherit dnf-bridge

PN = "net-snmp"
PE = "1"
PV = "5.9.4"
PR = "15.el10_0"
PACKAGES = "net-snmp net-snmp-agent-libs net-snmp-devel net-snmp-libs net-snmp-perl net-snmp-perl-module net-snmp-utils python3-net-snmp net-snmp-gui"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/net-snmp-5.9.4-15.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_net-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp}"
RDEPENDS:net-snmp = " \
 systemd \
 net-snmp-agent-libs \
 net-snmp-libs \
 perl-IO \
 perl-Term-ReadLine \
 perl-Getopt-Std \
 perl-File-Copy \
 bash \
 glibc \
 perl-interpreter \
 perl-Data-Dumper \
"

URI_net-snmp-agent-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-agent-libs-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-agent-libs}"
RDEPENDS:net-snmp-agent-libs = " \
 lm_sensors-libs \
 perl-libs \
 net-snmp-libs \
 libxcrypt \
 openssl-libs \
 mariadb-connector-c \
 glibc \
 rpm-libs \
"

URI_net-snmp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-devel-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-devel}"
RDEPENDS:net-snmp-devel = " \
 lm_sensors-devel \
 net-snmp-agent-libs \
 net-snmp-libs \
 perl-devel \
 redhat-rpm-config \
 pkgconf-pkg-config \
 openssl-devel \
 rpm-devel \
 bash \
 elfutils-devel \
 elfutils-libelf-devel \
"

URI_net-snmp-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-libs-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-libs}"
RDEPENDS:net-snmp-libs = " \
 glibc \
 openssl-libs \
"

URI_net-snmp-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-perl-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-perl}"
RDEPENDS:net-snmp-perl = " \
 perl-libnet \
 perl-libs \
 perl-FileHandle \
 perl-Getopt-Long \
 perl-Getopt-Std \
 perl-Sys-Hostname \
 perl-Carp \
 perl-vars \
 perl-JSON \
 perl-Data-Dumper \
 net-snmp-agent-libs \
 net-snmp-devel \
 net-snmp-libs \
 net-snmp-perl-module \
 bash \
 perl-Fcntl \
 perl-POSIX \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
"

URI_net-snmp-perl-module = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-perl-module-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-perl-module}"
RDEPENDS:net-snmp-perl-module = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-interpreter \
 net-snmp-libs \
 net-snmp-agent-libs \
 net-snmp-perl-module \
 perl-DynaLoader \
 perl-overload \
 perl-AutoLoader \
 glibc \
 perl-Exporter \
 perl-Data-Dumper \
"

URI_net-snmp-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/net-snmp-utils-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-utils}"
RDEPENDS:net-snmp-utils = " \
 glibc \
 openssl-libs \
 net-snmp-libs \
"

URI_python3-net-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-net-snmp-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-net-snmp}"
RDEPENDS:python3-net-snmp = " \
 glibc \
 python3 \
 net-snmp-libs \
"

URI_net-snmp-gui = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/net-snmp-gui-5.9.4-15.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_net-snmp-gui}"
RDEPENDS:net-snmp-gui = " \
 perl-Tk \
 perl-libs \
 net-snmp-perl-module \
 perl-Getopt-Std \
 perl-interpreter \
 perl-Data-Dumper \
"

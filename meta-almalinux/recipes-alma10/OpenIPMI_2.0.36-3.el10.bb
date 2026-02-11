
inherit dnf-bridge

PN = "OpenIPMI"
PE = "0"
PV = "2.0.36"
PR = "3.el10"
PACKAGES = "OpenIPMI OpenIPMI-lanserv OpenIPMI-libs OpenIPMI-devel"


URI_OpenIPMI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/OpenIPMI-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI = " \
 systemd \
 net-snmp-libs \
 readline \
 gdbm-libs \
 bash \
 glib2 \
 OpenIPMI-libs \
 glibc \
"

URI_OpenIPMI-lanserv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/OpenIPMI-lanserv-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI-lanserv = " \
 openssl-libs \
 OpenIPMI \
 popt \
 OpenIPMI-libs \
 glibc \
"

URI_OpenIPMI-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/OpenIPMI-libs-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI-libs = " \
 net-snmp-libs \
 openssl-libs \
 gdbm-libs \
 ncurses-libs \
 glib2 \
 glibc \
"

URI_OpenIPMI-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/OpenIPMI-devel-2.0.36-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:OpenIPMI-devel = " \
 ncurses-devel \
 OpenIPMI-devel \
 pkgconf-pkg-config \
 OpenIPMI \
 OpenIPMI-lanserv \
 OpenIPMI-libs \
"

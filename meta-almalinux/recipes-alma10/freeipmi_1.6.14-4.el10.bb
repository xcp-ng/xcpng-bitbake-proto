
inherit dnf-bridge

PN = "freeipmi"
PE = "0"
PV = "1.6.14"
PR = "4.el10"
PACKAGES = "freeipmi freeipmi-bmc-watchdog freeipmi-ipmidetectd freeipmi-ipmiseld freeipmi-devel"


URI_freeipmi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi = " \
 glibc \
 systemd \
 bash \
 libgcrypt \
"

URI_freeipmi-bmc-watchdog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-bmc-watchdog-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-bmc-watchdog = " \
 glibc \
 freeipmi \
 bash \
"

URI_freeipmi-ipmidetectd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-ipmidetectd-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-ipmidetectd = " \
 glibc \
 freeipmi \
 bash \
"

URI_freeipmi-ipmiseld = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/freeipmi-ipmiseld-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-ipmiseld = " \
 glibc \
 freeipmi \
 bash \
"

URI_freeipmi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/freeipmi-devel-1.6.14-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:freeipmi-devel = " \
 freeipmi \
 pkgconf-pkg-config \
"


inherit dnf-bridge

PN = "procps-ng"
PE = "0"
PV = "4.0.4"
PR = "7.el10"
PACKAGES = "procps-ng procps-ng-i18n procps-ng-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/procps-ng-4.0.4-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_procps-ng = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/procps-ng-4.0.4-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_procps-ng}"
RDEPENDS:procps-ng = " \
 glibc \
 ncurses-libs \
 systemd-libs \
"

URI_procps-ng-i18n = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/procps-ng-i18n-4.0.4-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_procps-ng-i18n}"
RDEPENDS:procps-ng-i18n = " \
 procps-ng \
"

URI_procps-ng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/procps-ng-devel-4.0.4-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_procps-ng-devel}"
RDEPENDS:procps-ng-devel = " \
 procps-ng \
 pkgconf-pkg-config \
"

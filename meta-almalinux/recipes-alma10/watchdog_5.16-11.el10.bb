
inherit dnf-bridge

PN = "watchdog"
PE = "0"
PV = "5.16"
PR = "11.el10"
PACKAGES = "watchdog"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/watchdog-5.16-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_watchdog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/watchdog-5.16-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_watchdog}"
RDEPENDS:watchdog = " \
 glibc \
 systemd \
 bash \
"

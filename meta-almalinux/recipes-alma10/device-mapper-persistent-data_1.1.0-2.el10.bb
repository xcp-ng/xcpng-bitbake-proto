
inherit dnf-bridge

PN = "device-mapper-persistent-data"
PE = "0"
PV = "1.1.0"
PR = "2.el10"
PACKAGES = "device-mapper-persistent-data"


URI_device-mapper-persistent-data = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/device-mapper-persistent-data-1.1.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:device-mapper-persistent-data = " \
 glibc \
 libgcc \
 systemd-libs \
"

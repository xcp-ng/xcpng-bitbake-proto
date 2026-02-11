
PN = "cachefilesd"
PE = "0"
PV = "0.10.10"
PR = "20.el10"
PACKAGES = "cachefilesd"


URI_cachefilesd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cachefilesd-0.10.10-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cachefilesd = " \
 glibc \
 selinux-policy \
 systemd \
 bash \
"


PN = "sysstat"
PE = "0"
PV = "12.7.6"
PR = "2.el10"
PACKAGES = "sysstat"


URI_sysstat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysstat-12.7.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysstat = " \
 lm_sensors-libs \
 pcp-libs \
 bash \
 xz \
 glibc \
 findutils \
"

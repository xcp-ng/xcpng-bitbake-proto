
PN = "perftest"
PE = "0"
PV = "24.10.0.0.66"
PR = "1.el10"
PACKAGES = "perftest"


URI_perftest = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/perftest-24.10.0.0.66-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perftest = " \
 librdmacm \
 libibumad \
 pciutils-libs \
 libibverbs \
 glibc \
"

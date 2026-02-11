
PN = "opencsd"
PE = "0"
PV = "1.4.1"
PR = "4.el10"
PACKAGES = "opencsd opencsd-devel"


URI_opencsd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opencsd-1.4.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencsd = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_opencsd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opencsd-devel-1.4.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencsd-devel = " \
 opencsd \
"

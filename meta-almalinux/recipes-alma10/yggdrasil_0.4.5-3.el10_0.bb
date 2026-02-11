
PN = "yggdrasil"
PE = "0"
PV = "0.4.5"
PR = "3.el10_0"
PACKAGES = "yggdrasil yggdrasil-devel yggdrasil-examples"


URI_yggdrasil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/yggdrasil-0.4.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:yggdrasil = " \
 glibc \
 shadow-utils \
 bash \
"

URI_yggdrasil-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/yggdrasil-devel-0.4.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:yggdrasil-devel = " \
 pkgconf-pkg-config \
"

URI_yggdrasil-examples = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yggdrasil-examples-0.4.5-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:yggdrasil-examples = " \
 glibc \
 yggdrasil \
"

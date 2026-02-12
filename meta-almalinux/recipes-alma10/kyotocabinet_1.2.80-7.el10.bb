
inherit dnf-bridge

PN = "kyotocabinet"
PE = "0"
PV = "1.2.80"
PR = "7.el10"
PACKAGES = "kyotocabinet-libs kyotocabinet kyotocabinet-apidocs kyotocabinet-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/kyotocabinet-1.2.80-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_kyotocabinet-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kyotocabinet-libs-1.2.80-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_kyotocabinet-libs}"
RDEPENDS:kyotocabinet-libs = " \
 zlib-ng-compat \
 lzo \
 libgcc \
 libstdc++ \
 glibc \
 xz-libs \
"

URI_kyotocabinet = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kyotocabinet-1.2.80-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_kyotocabinet}"
RDEPENDS:kyotocabinet = " \
 glibc \
 libgcc \
 kyotocabinet-libs \
 libstdc++ \
"

URI_kyotocabinet-apidocs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kyotocabinet-apidocs-1.2.80-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_kyotocabinet-apidocs}"
RDEPENDS:kyotocabinet-apidocs = ""

URI_kyotocabinet-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/kyotocabinet-devel-1.2.80-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_kyotocabinet-devel}"
RDEPENDS:kyotocabinet-devel = " \
 kyotocabinet-libs \
 pkgconf-pkg-config \
"

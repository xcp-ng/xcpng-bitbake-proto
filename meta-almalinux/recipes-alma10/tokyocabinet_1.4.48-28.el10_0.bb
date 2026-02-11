
inherit dnf-bridge

PN = "tokyocabinet"
PE = "0"
PV = "1.4.48"
PR = "28.el10_0"
PACKAGES = "tokyocabinet tokyocabinet-devel tokyocabinet-devel-doc"


URI_tokyocabinet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tokyocabinet-1.4.48-28.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:tokyocabinet = " \
 glibc \
 zlib-ng-compat \
 bzip2-libs \
"

URI_tokyocabinet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tokyocabinet-devel-1.4.48-28.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:tokyocabinet-devel = " \
 tokyocabinet \
 pkgconf-pkg-config \
"

URI_tokyocabinet-devel-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tokyocabinet-devel-doc-1.4.48-28.el10_0.noarch.rpm;unpack=0"
RDEPENDS:tokyocabinet-devel-doc = " \
 tokyocabinet \
 pkgconf-pkg-config \
"

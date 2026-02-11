
PN = "brotli"
PE = "0"
PV = "1.1.0"
PR = "6.el10"
PACKAGES = "libbrotli brotli brotli-devel python3-brotli"


URI_libbrotli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libbrotli-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbrotli = " \
 glibc \
"

URI_brotli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brotli-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brotli = " \
 glibc \
 libbrotli \
"

URI_brotli-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/brotli-devel-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:brotli-devel = " \
 brotli-devel \
 brotli \
 libbrotli \
 pkgconf-pkg-config \
"

URI_python3-brotli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-brotli-1.1.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-brotli = " \
 glibc \
 python3 \
"

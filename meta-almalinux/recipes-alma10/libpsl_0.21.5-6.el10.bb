
inherit dnf-bridge

PN = "libpsl"
PE = "0"
PV = "0.21.5"
PR = "6.el10"
PACKAGES = "libpsl libpsl-devel psl psl-make-dafsa"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libpsl-0.21.5-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libpsl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpsl-0.21.5-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpsl}"
RDEPENDS:libpsl = " \
 glibc \
 libidn2 \
 publicsuffix-list-dafsa \
 libunistring \
"

URI_libpsl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpsl-devel-0.21.5-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpsl-devel}"
RDEPENDS:libpsl-devel = " \
 libpsl \
 publicsuffix-list \
 pkgconf-pkg-config \
"

URI_psl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psl-0.21.5-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_psl}"
RDEPENDS:psl = " \
 glibc \
 libpsl \
"

URI_psl-make-dafsa = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/psl-make-dafsa-0.21.5-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_psl-make-dafsa}"
RDEPENDS:psl-make-dafsa = " \
 python3 \
"

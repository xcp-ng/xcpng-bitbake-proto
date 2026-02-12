
inherit dnf-bridge

PN = "sqlite"
PE = "0"
PV = "3.46.1"
PR = "5.el10_0"
PACKAGES = "sqlite-libs sqlite sqlite-devel lemon sqlite-analyzer sqlite-doc sqlite-tcl sqlite-tools"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/sqlite-3.46.1-5.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sqlite-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sqlite-libs-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sqlite-libs}"
RDEPENDS:sqlite-libs = " \
 glibc \
 zlib-ng-compat \
"

URI_sqlite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sqlite-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sqlite}"
RDEPENDS:sqlite = " \
 glibc \
 sqlite-libs \
 zlib-ng-compat \
 readline \
"

URI_sqlite-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sqlite-devel-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sqlite-devel}"
RDEPENDS:sqlite-devel = " \
 sqlite-libs \
 sqlite \
 pkgconf-pkg-config \
"

URI_lemon = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lemon-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lemon}"
RDEPENDS:lemon = " \
 glibc \
"

URI_sqlite-analyzer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-analyzer-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sqlite-analyzer}"
RDEPENDS:sqlite-analyzer = " \
 glibc \
 sqlite \
 tcl \
"

URI_sqlite-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-doc-3.46.1-5.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_sqlite-doc}"
RDEPENDS:sqlite-doc = ""

URI_sqlite-tcl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-tcl-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sqlite-tcl}"
RDEPENDS:sqlite-tcl = " \
 zlib-ng-compat \
 tcl \
 sqlite-libs \
 glibc \
 sqlite \
"

URI_sqlite-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sqlite-tools-3.46.1-5.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sqlite-tools}"
RDEPENDS:sqlite-tools = " \
 glibc \
"

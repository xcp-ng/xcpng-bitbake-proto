
inherit dnf-bridge

PN = "libdex"
PE = "0"
PV = "0.8.1"
PR = "1.el10"
PACKAGES = "libdex libdex-devel libdex-devel-docs"


URI_libdex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdex-0.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdex = " \
 libatomic \
 libgcc \
 glib2 \
 glibc \
 liburing \
"

URI_libdex-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdex-devel-0.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdex-devel = " \
 glib2-devel \
 libdex \
 pkgconf-pkg-config \
"

URI_libdex-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdex-devel-docs-0.8.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libdex-devel-docs = " \
 libdex \
"


inherit dnf-bridge

PN = "libdnf"
PE = "0"
PV = "0.73.1"
PR = "9.el10_0.alma.1"
PACKAGES = "libdnf python3-hawkey python3-libdnf libdnf-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libdnf-0.73.1-9.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdnf-0.73.1-9.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdnf}"
RDEPENDS:libdnf = " \
 libsolv \
 libgcc \
 json-c \
 libmodulemd \
 sqlite-libs \
 libstdc++ \
 glib2 \
 librepo \
 glibc \
 rpm-libs \
 libsmartcols \
"

URI_python3-hawkey = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-hawkey-0.73.1-9.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-hawkey}"
RDEPENDS:python3-hawkey = " \
 python3 \
 libsolv \
 python3-libdnf \
 libgcc \
 python3-libs \
 libstdc++ \
 glib2 \
 glibc \
 libdnf \
"

URI_python3-libdnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libdnf-0.73.1-9.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libdnf}"
RDEPENDS:python3-libdnf = " \
 python3 \
 libgcc \
 python3-libs \
 libstdc++ \
 glibc \
 libdnf \
 libsmartcols \
"

URI_libdnf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdnf-devel-0.73.1-9.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdnf-devel}"
RDEPENDS:libdnf-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 libsolv-devel \
 rpm-devel \
 libdnf \
 librepo-devel \
 sqlite-devel \
"

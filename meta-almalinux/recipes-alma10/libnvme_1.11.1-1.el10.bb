
inherit dnf-bridge

PN = "libnvme"
PE = "0"
PV = "1.11.1"
PR = "1.el10"
PACKAGES = "libnvme python3-libnvme libnvme-devel libnvme-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libnvme-1.11.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libnvme = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnvme-1.11.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnvme}"
RDEPENDS:libnvme = " \
 keyutils-libs \
 openssl-libs \
 libgcc \
 json-c \
 glibc \
 dbus-libs \
"

URI_python3-libnvme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libnvme-1.11.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libnvme}"
RDEPENDS:python3-libnvme = " \
 glibc \
 python3 \
 libnvme \
"

URI_libnvme-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnvme-devel-1.11.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnvme-devel}"
RDEPENDS:libnvme-devel = " \
 pkgconf-pkg-config \
 openssl-devel \
 dbus-devel \
 keyutils-libs-devel \
 libnvme \
 json-c-devel \
"

URI_libnvme-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnvme-doc-1.11.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_libnvme-doc}"
RDEPENDS:libnvme-doc = ""

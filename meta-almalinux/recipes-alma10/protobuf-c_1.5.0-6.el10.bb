
inherit dnf-bridge

PN = "protobuf-c"
PE = "0"
PV = "1.5.0"
PR = "6.el10"
PACKAGES = "protobuf-c protobuf-c-compiler protobuf-c-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/protobuf-c-1.5.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_protobuf-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/protobuf-c-1.5.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_protobuf-c}"
RDEPENDS:protobuf-c = " \
 glibc \
"

URI_protobuf-c-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-c-compiler-1.5.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_protobuf-c-compiler}"
RDEPENDS:protobuf-c-compiler = " \
 protobuf \
 libgcc \
 libstdc++ \
 glibc \
 protobuf-c \
 protobuf-compiler \
"

URI_protobuf-c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/protobuf-c-devel-1.5.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_protobuf-c-devel}"
RDEPENDS:protobuf-c-devel = " \
 protobuf-c \
 protobuf-c-compiler \
 pkgconf-pkg-config \
"

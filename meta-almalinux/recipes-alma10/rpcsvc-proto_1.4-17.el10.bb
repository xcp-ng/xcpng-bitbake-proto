
inherit dnf-bridge

PN = "rpcsvc-proto"
PE = "0"
PV = "1.4"
PR = "17.el10"
PACKAGES = "rpcgen rpcsvc-proto-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rpcsvc-proto-1.4-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rpcgen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpcgen-1.4-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rpcgen}"
RDEPENDS:rpcgen = " \
 glibc \
"

URI_rpcsvc-proto-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rpcsvc-proto-devel-1.4-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rpcsvc-proto-devel}"
RDEPENDS:rpcsvc-proto-devel = ""

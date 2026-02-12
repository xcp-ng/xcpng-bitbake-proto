
inherit dnf-bridge

PN = "libguestfs-winsupport"
PE = "0"
PV = "10.0"
PR = "5.el10"
PACKAGES = "libguestfs-winsupport"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libguestfs-winsupport-10.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libguestfs-winsupport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libguestfs-winsupport-10.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libguestfs-winsupport}"
RDEPENDS:libguestfs-winsupport = " \
 fuse-libs \
 libguestfs \
"

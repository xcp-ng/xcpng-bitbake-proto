
inherit dnf-bridge

PN = "bootc"
PE = "0"
PV = "1.1.6"
PR = "2.el10_0"
PACKAGES = "bootc system-reinstall-bootc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/bootc-1.1.6-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bootc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bootc-1.1.6-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bootc}"
RDEPENDS:bootc = " \
 ostree-libs \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 composefs \
 libzstd \
 skopeo \
 bash \
 glib2 \
 glibc \
 ostree \
 podman \
"

URI_system-reinstall-bootc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/system-reinstall-bootc-1.1.6-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_system-reinstall-bootc}"
RDEPENDS:system-reinstall-bootc = " \
 glibc \
 libgcc \
 bash \
"

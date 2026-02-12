
inherit dnf-bridge

PN = "libkeepalive"
PE = "0"
PV = "0.3"
PR = "24.el10"
PACKAGES = "libkeepalive"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libkeepalive-0.3-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libkeepalive = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libkeepalive-0.3-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libkeepalive}"
RDEPENDS:libkeepalive = " \
 glibc \
"

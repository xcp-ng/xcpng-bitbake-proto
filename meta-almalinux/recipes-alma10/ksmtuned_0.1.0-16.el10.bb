
inherit dnf-bridge

PN = "ksmtuned"
PE = "0"
PV = "0.1.0"
PR = "16.el10"
PACKAGES = "ksmtuned"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ksmtuned-0.1.0-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ksmtuned = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ksmtuned-0.1.0-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ksmtuned}"
RDEPENDS:ksmtuned = " \
 glibc \
 systemd \
 bash \
"

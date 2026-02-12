
inherit dnf-bridge

PN = "switcheroo-control"
PE = "0"
PV = "2.6"
PR = "7.el10"
PACKAGES = "switcheroo-control switcheroo-control-docs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/switcheroo-control-2.6-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_switcheroo-control = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/switcheroo-control-2.6-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_switcheroo-control}"
RDEPENDS:switcheroo-control = " \
 python3 \
 systemd \
 libgcc \
 libgudev \
 bash \
 glib2 \
 glibc \
"

URI_switcheroo-control-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/switcheroo-control-docs-2.6-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_switcheroo-control-docs}"
RDEPENDS:switcheroo-control-docs = ""

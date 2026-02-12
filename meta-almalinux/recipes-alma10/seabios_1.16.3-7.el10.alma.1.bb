
inherit dnf-bridge

PN = "seabios"
PE = "0"
PV = "1.16.3"
PR = "7.el10.alma.1"
PACKAGES = "seabios seabios-bin seavgabios-bin"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/seabios-1.16.3-7.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_seabios = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/seabios-1.16.3-7.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_seabios}"
RDEPENDS:seabios = " \
 seabios-bin \
 seavgabios-bin \
"

URI_seabios-bin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/seabios-bin-1.16.3-7.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_seabios-bin}"
RDEPENDS:seabios-bin = ""

URI_seavgabios-bin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/seavgabios-bin-1.16.3-7.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_seavgabios-bin}"
RDEPENDS:seavgabios-bin = ""

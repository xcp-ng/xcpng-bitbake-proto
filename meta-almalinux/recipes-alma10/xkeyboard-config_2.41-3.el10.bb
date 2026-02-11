
PN = "xkeyboard-config"
PE = "0"
PV = "2.41"
PR = "3.el10"
PACKAGES = "xkeyboard-config xkeyboard-config-devel"


URI_xkeyboard-config = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xkeyboard-config-2.41-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xkeyboard-config = ""
RPROVIDES:xkeyboard-config = "xkeyboard-config ( =  2.41-3.el10)"

URI_xkeyboard-config-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xkeyboard-config-devel-2.41-3.el10.noarch.rpm;unpack=0"
RDEPENDS:xkeyboard-config-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) xkeyboard-config ( =  2.41-3.el10)"
RPROVIDES:xkeyboard-config-devel = "pkgconfig(xkeyboard-config) ( =  2.41) xkeyboard-config-devel ( =  2.41-3.el10)"

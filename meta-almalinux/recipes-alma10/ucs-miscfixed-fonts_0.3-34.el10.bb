
PN = "ucs-miscfixed-fonts"
PE = "0"
PV = "0.3"
PR = "34.el10"
PACKAGES = "ucs-miscfixed-fonts ucs-miscfixed-opentype-fonts"


URI_ucs-miscfixed-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucs-miscfixed-fonts-0.3-34.el10.noarch.rpm;unpack=0"
RDEPENDS:ucs-miscfixed-fonts = ""
RPROVIDES:ucs-miscfixed-fonts = "config(ucs-miscfixed-fonts) ( =  0.3-34.el10) ucs-miscfixed-fonts ( =  0.3-34.el10)"

URI_ucs-miscfixed-opentype-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ucs-miscfixed-opentype-fonts-0.3-34.el10.noarch.rpm;unpack=0"
RDEPENDS:ucs-miscfixed-opentype-fonts = ""
RPROVIDES:ucs-miscfixed-opentype-fonts = "font(clean) ( ) font(fixed) ( ) config(ucs-miscfixed-opentype-fonts) ( =  0.3-34.el10) ucs-miscfixed-opentype-fonts ( =  0.3-34.el10)"

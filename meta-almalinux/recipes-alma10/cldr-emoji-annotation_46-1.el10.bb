
PN = "cldr-emoji-annotation"
PE = "0"
PV = "46"
PR = "1.el10"
PACKAGES = "cldr-emoji-annotation cldr-emoji-annotation-dtd cldr-emoji-annotation-devel"


URI_cldr-emoji-annotation = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cldr-emoji-annotation-46-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cldr-emoji-annotation = "cldr-emoji-annotation-dtd ( )"
RPROVIDES:cldr-emoji-annotation = "cldr-emoji-annotation ( =  46-1.el10)"

URI_cldr-emoji-annotation-dtd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cldr-emoji-annotation-dtd-46-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cldr-emoji-annotation-dtd = "cldr-emoji-annotation ( =  46-1.el10)"
RPROVIDES:cldr-emoji-annotation-dtd = "cldr-emoji-annotation-dtd ( =  46-1.el10)"

URI_cldr-emoji-annotation-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cldr-emoji-annotation-devel-46-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cldr-emoji-annotation-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) cldr-emoji-annotation ( =  46-1.el10)"
RPROVIDES:cldr-emoji-annotation-devel = "cldr-emoji-annotation-devel ( =  46-1.el10) pkgconfig(cldr-emoji-annotation) ( =  46)"


PN = "totem-pl-parser"
PE = "0"
PV = "3.26.6"
PR = "10.el10"
PACKAGES = "totem-pl-parser totem-pl-parser-devel"


URI_totem-pl-parser = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/totem-pl-parser-3.26.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:totem-pl-parser = "
 libarchive
 libgcc
 libgcrypt
 libxml2
 glib2
 glibc
 uchardet
"

URI_totem-pl-parser-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/totem-pl-parser-devel-3.26.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:totem-pl-parser-devel = "
 libxml2-devel
 libarchive-devel
 glib2-devel
 pkgconf-pkg-config
 totem-pl-parser
"


PN = "fontconfig"
PE = "0"
PV = "2.15.0"
PR = "7.el10"
PACKAGES = "fontconfig fontconfig-devel fontconfig-devel-doc"


URI_fontconfig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fontconfig-2.15.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fontconfig = "
 fonts-filesystem
 freetype
 grep
 libxml2
 bash
 xml-common
 glibc
 coreutils
 default-fonts-core-sans
"

URI_fontconfig-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fontconfig-devel-2.15.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fontconfig-devel = "
 libxml2-devel
 freetype-devel
 pkgconf-pkg-config
 fontconfig
 gettext
"

URI_fontconfig-devel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fontconfig-devel-doc-2.15.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:fontconfig-devel-doc = "
 fontconfig-devel
"


PN = "fontconfig"
PE = "0"
PV = "2.15.0"
PR = "7.el10"
PACKAGES = "fontconfig fontconfig-devel fontconfig-devel-doc"


URI_fontconfig = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fontconfig-2.15.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fontconfig = "/bin/sh ( ) coreutils ( ) grep ( ) xml-common ( ) freetype ( >=  2.9.1-6) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libfreetype.so.6()(64bit) ( ) freetype ( ) fonts-filesystem ( ) font(:lang=en) ( )"
RPROVIDES:fontconfig = "libfontconfig.so.1()(64bit) ( ) fontconfig(x86-64) ( =  2.15.0-7.el10) config(fontconfig) ( =  2.15.0-7.el10) fontconfig ( =  2.15.0-7.el10)"

URI_fontconfig-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fontconfig-devel-2.15.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fontconfig-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libfontconfig.so.1()(64bit) ( ) gettext ( ) fontconfig(x86-64) ( =  2.15.0-7.el10) freetype-devel ( >=  2.9.1) pkgconfig(freetype2) ( >=  21.0.15) pkgconfig(libxml-2.0) ( >=  2.6)"
RPROVIDES:fontconfig-devel = "fontconfig-devel ( =  2.15.0-7.el10) fontconfig-devel(x86-64) ( =  2.15.0-7.el10) pkgconfig(fontconfig) ( =  2.15.0)"

URI_fontconfig-devel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fontconfig-devel-doc-2.15.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:fontconfig-devel-doc = "fontconfig-devel ( =  2.15.0-7.el10)"
RPROVIDES:fontconfig-devel-doc = "fontconfig-devel-doc ( =  2.15.0-7.el10)"


PN = "colord-gtk"
PE = "0"
PV = "0.3.1"
PR = "4.el10"
PACKAGES = "colord-gtk colord-gtk4 colord-gtk-devel colord-gtk4-devel"


URI_colord-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-gtk-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libcolord.so.2()(64bit) ( )"
RPROVIDES:colord-gtk = "libcolord-gtk.so.1()(64bit) ( ) colord-gtk ( =  0.3.1-4.el10) colord-gtk(x86-64) ( =  0.3.1-4.el10)"

URI_colord-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-gtk4-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk4 = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libcolord.so.2()(64bit) ( )"
RPROVIDES:colord-gtk4 = "libcolord-gtk4.so.1()(64bit) ( ) colord-gtk4 ( =  0.3.1-4.el10) colord-gtk4(x86-64) ( =  0.3.1-4.el10)"

URI_colord-gtk-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/colord-gtk-devel-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk-devel = "/usr/bin/pkg-config ( ) pkgconfig(gtk+-3.0) ( ) pkgconfig(colord) ( ) libcolord-gtk.so.1()(64bit) ( ) colord-gtk(x86-64) ( =  0.3.1-4.el10)"
RPROVIDES:colord-gtk-devel = "colord-gtk-devel ( =  0.3.1-4.el10) colord-gtk-devel(x86-64) ( =  0.3.1-4.el10) pkgconfig(colord-gtk) ( =  0.3.1)"

URI_colord-gtk4-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/colord-gtk4-devel-0.3.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-gtk4-devel = "/usr/bin/pkg-config ( ) pkgconfig(gtk4) ( ) libcolord-gtk4.so.1()(64bit) ( ) pkgconfig(colord) ( ) colord-gtk-devel(x86-64) ( =  0.3.1-4.el10)"
RPROVIDES:colord-gtk4-devel = "colord-gtk4-devel ( =  0.3.1-4.el10) colord-gtk4-devel(x86-64) ( =  0.3.1-4.el10) pkgconfig(colord-gtk4) ( =  0.3.1)"

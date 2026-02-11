
PN = "anthy-unicode"
PE = "0"
PV = "1.0.0.20240502"
PR = "12.el10"
PACKAGES = "anthy-unicode anthy-unicode-devel emacs-anthy-unicode"


URI_anthy-unicode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/anthy-unicode-1.0.0.20240502-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:anthy-unicode = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:anthy-unicode = "libanthy-unicode.so.0()(64bit) ( ) libanthydic-unicode.so.0()(64bit) ( ) libanthyinput-unicode.so.0()(64bit) ( ) anthy-unicode ( =  1.0.0.20240502-12.el10) anthy-unicode(x86-64) ( =  1.0.0.20240502-12.el10) config(anthy-unicode) ( =  1.0.0.20240502-12.el10)"

URI_anthy-unicode-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/anthy-unicode-devel-1.0.0.20240502-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:anthy-unicode-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libanthy-unicode.so.0()(64bit) ( ) libanthydic-unicode.so.0()(64bit) ( ) libanthyinput-unicode.so.0()(64bit) ( ) anthy-unicode(x86-64) ( =  1.0.0.20240502-12.el10)"
RPROVIDES:anthy-unicode-devel = "anthy-unicode-devel ( =  1.0.0.20240502-12.el10) anthy-unicode-devel(x86-64) ( =  1.0.0.20240502-12.el10) pkgconfig(anthy-unicode) ( =  1.0.0.20241212)"

URI_emacs-anthy-unicode = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-anthy-unicode-1.0.0.20240502-12.el10.noarch.rpm;unpack=0"
RDEPENDS:emacs-anthy-unicode = "emacs-filesystem ( >=  29.4) anthy-unicode ( =  1.0.0.20240502-12.el10)"
RPROVIDES:emacs-anthy-unicode = "emacs-anthy-unicode ( =  1.0.0.20240502-12.el10)"


PN = "ibus-anthy"
PE = "0"
PV = "1.5.16"
PR = "22.el10"
PACKAGES = "ibus-anthy ibus-anthy-python ibus-anthy-devel ibus-anthy-tests"


URI_ibus-anthy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-anthy-1.5.16-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-anthy = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) anthy-unicode ( ) kasumi-unicode ( ) libanthy-unicode.so.0()(64bit) ( ) libanthydic-unicode.so.0()(64bit) ( ) ibus ( >=  1.5.3) ibus-anthy-python ( =  1.5.16-22.el10)"
RPROVIDES:ibus-anthy = "application() ( ) application(ibus-setup-anthy.desktop) ( ) libanthygobject-1.0.so.5()(64bit) ( ) ibus-anthy ( =  1.5.16-22.el10) ibus-anthy(x86-64) ( =  1.5.16-22.el10)"

URI_ibus-anthy-python = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-anthy-python-1.5.16-22.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-anthy-python = "/usr/bin/sh ( ) python3-gobject ( ) gtk3 ( ) python3-cairo ( ) ibus-anthy ( =  1.5.16-22.el10)"
RPROVIDES:ibus-anthy-python = "metainfo() ( ) metainfo(org.freedesktop.ibus.engine.anthy.metainfo.xml) ( ) ibus-anthy-python ( =  1.5.16-22.el10)"

URI_ibus-anthy-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-anthy-devel-1.5.16-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-anthy-devel = "glib2-devel ( ) anthy-unicode-devel ( ) libanthygobject-1.0.so.5()(64bit) ( ) ibus-anthy(x86-64) ( =  1.5.16-22.el10)"
RPROVIDES:ibus-anthy-devel = "ibus-anthy-devel ( =  1.5.16-22.el10) ibus-anthy-devel(x86-64) ( =  1.5.16-22.el10)"

URI_ibus-anthy-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-anthy-tests-1.5.16-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-anthy-tests = "/usr/bin/python3 ( ) python3-pycotap ( ) ibus-anthy(x86-64) ( =  1.5.16-22.el10)"
RPROVIDES:ibus-anthy-tests = "ibus-anthy-tests ( =  1.5.16-22.el10) ibus-anthy-tests(x86-64) ( =  1.5.16-22.el10)"

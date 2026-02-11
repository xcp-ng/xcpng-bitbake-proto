
PN = "harfbuzz"
PE = "0"
PV = "8.4.0"
PR = "6.el10"
PACKAGES = "harfbuzz harfbuzz-cairo harfbuzz-devel harfbuzz-icu"


URI_harfbuzz = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/harfbuzz-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libfreetype.so.6()(64bit) ( ) libgraphite2.so.3()(64bit) ( )"
RPROVIDES:harfbuzz = "libharfbuzz.so.0()(64bit) ( ) libharfbuzz-gobject.so.0()(64bit) ( ) libharfbuzz-subset.so.0()(64bit) ( ) harfbuzz ( =  8.4.0-6.el10) harfbuzz(x86-64) ( =  8.4.0-6.el10)"

URI_harfbuzz-cairo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/harfbuzz-cairo-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz-cairo = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libcairo.so.2()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) harfbuzz(x86-64) ( =  8.4.0-6.el10)"
RPROVIDES:harfbuzz-cairo = "libharfbuzz-cairo.so.0()(64bit) ( ) harfbuzz-cairo(x86-64) ( =  8.4.0-6.el10) harfbuzz-cairo ( =  8.4.0-6.el10)"

URI_harfbuzz-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/harfbuzz-devel-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libcairo.so.2()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libharfbuzz-subset.so.0()(64bit) ( ) libharfbuzz-cairo.so.0()(64bit) ( ) libharfbuzz-icu.so.0()(64bit) ( ) libharfbuzz-gobject.so.0()(64bit) ( ) harfbuzz(x86-64) ( =  8.4.0-6.el10) pkgconfig(gobject-2.0) ( >=  2.30.0) harfbuzz-cairo(x86-64) ( =  8.4.0-6.el10) harfbuzz-icu(x86-64) ( =  8.4.0-6.el10) pkgconfig(glib-2.0) ( >=  2.30.0) pkgconfig(cairo) ( >=  1.10.0) pkgconfig(freetype2) ( >=  12.0.6) pkgconfig(graphite2) ( >=  1.2.0) pkgconfig(icu-uc) ( >=  49.0)"
RPROVIDES:harfbuzz-devel = "harfbuzz-devel ( =  8.4.0-6.el10) harfbuzz-devel(x86-64) ( =  8.4.0-6.el10) pkgconfig(harfbuzz) ( =  8.4.0) pkgconfig(harfbuzz-cairo) ( =  8.4.0) pkgconfig(harfbuzz-gobject) ( =  8.4.0) pkgconfig(harfbuzz-icu) ( =  8.4.0) pkgconfig(harfbuzz-subset) ( =  8.4.0)"

URI_harfbuzz-icu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/harfbuzz-icu-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz-icu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libicuuc.so.74()(64bit) ( ) harfbuzz(x86-64) ( =  8.4.0-6.el10)"
RPROVIDES:harfbuzz-icu = "libharfbuzz-icu.so.0()(64bit) ( ) harfbuzz-icu(x86-64) ( =  8.4.0-6.el10) harfbuzz-icu ( =  8.4.0-6.el10)"

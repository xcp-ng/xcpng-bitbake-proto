
PN = "plymouth"
PE = "0"
PV = "24.004.60"
PR = "13.el10.alma.1"
PACKAGES = "plymouth plymouth-core-libs plymouth-devel plymouth-graphics-libs plymouth-plugin-fade-throbber plymouth-plugin-label plymouth-plugin-script plymouth-plugin-space-flares plymouth-plugin-two-step plymouth-scripts plymouth-system-theme plymouth-theme-fade-in plymouth-theme-script plymouth-theme-solar plymouth-theme-spinfinity plymouth-theme-spinner"


URI_plymouth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) xkeyboard-config ( ) plymouth-core-libs ( =  24.004.60-13.el10.alma.1) plymouth-scripts ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth = "plymouth ( =  24.004.60-13.el10.alma.1) config(plymouth) ( =  24.004.60-13.el10.alma.1) plymouth(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-core-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-core-libs-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-core-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libevdev.so.2()(64bit) ( ) libevdev.so.2(LIBEVDEV_1)(64bit) ( )"
RPROVIDES:plymouth-core-libs = "libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) libply-boot-client.so.5()(64bit) ( ) plymouth-core-libs ( =  24.004.60-13.el10.alma.1) plymouth-core-libs(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-devel-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-devel = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libcairo.so.2()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) pkgconfig ( ) libgdk-3.so.0()(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) libply-splash-graphics.so.5()(64bit) ( ) pkgconfig(xkbcommon) ( ) pkgconfig(libudev) ( ) libply-boot-client.so.5()(64bit) ( ) pkgconfig(libevdev) ( ) pkgconfig(ply-splash-core) ( ) pkgconfig(xkeyboard-config) ( ) plymouth ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1) pkgconfig(libpng) ( >=  1.2.16)"
RPROVIDES:plymouth-devel = "pkgconfig(ply-boot-client) ( =  24.004.60) pkgconfig(ply-splash-core) ( =  24.004.60) pkgconfig(ply-splash-graphics) ( =  24.004.60) plymouth-devel ( =  24.004.60-13.el10.alma.1) plymouth-devel(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-graphics-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-graphics-libs-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-graphics-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libpng16.so.16()(64bit) ( ) libdrm.so.2()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( ) system-logos ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) plymouth-core-libs ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-graphics-libs = "libply-splash-graphics.so.5()(64bit) ( ) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-plugin-fade-throbber = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-fade-throbber-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-fade-throbber = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) libply-splash-graphics.so.5()(64bit) ( ) plymouth ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-plugin-fade-throbber = "plymouth-plugin-fade-throbber ( =  24.004.60-13.el10.alma.1) plymouth-plugin-fade-throbber(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-plugin-label = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-label-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-label = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) plymouth ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-plugin-label = "plymouth-plugin-label ( =  24.004.60-13.el10.alma.1) plymouth-plugin-label(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-plugin-script = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-script-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-script = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) libply-splash-graphics.so.5()(64bit) ( ) plymouth ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-plugin-script = "plymouth-plugin-script ( =  24.004.60-13.el10.alma.1) plymouth-plugin-script(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-plugin-space-flares = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-space-flares-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-space-flares = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.17)(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) libply-splash-graphics.so.5()(64bit) ( ) plymouth ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1) plymouth-plugin-label ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-plugin-space-flares = "plymouth-plugin-space-flares ( =  24.004.60-13.el10.alma.1) plymouth-plugin-space-flares(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-plugin-two-step = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-plugin-two-step-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-plugin-two-step = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libply-splash-core.so.5()(64bit) ( ) libply.so.5()(64bit) ( ) libply-splash-graphics.so.5()(64bit) ( ) plymouth ( =  24.004.60-13.el10.alma.1) plymouth-graphics-libs ( =  24.004.60-13.el10.alma.1) plymouth-plugin-label ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-plugin-two-step = "plymouth-plugin-two-step ( =  24.004.60-13.el10.alma.1) plymouth-plugin-two-step(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-scripts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-scripts-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-scripts = "/usr/bin/bash ( ) coreutils ( ) findutils ( ) dracut ( ) gzip ( ) xkeyboard-config ( ) cpio ( ) plymouth ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-scripts = "plymouth-scripts ( =  24.004.60-13.el10.alma.1) plymouth-scripts(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-system-theme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-system-theme-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-system-theme = "plymouth(system-theme) ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-system-theme = "plymouth-system-theme ( =  24.004.60-13.el10.alma.1) plymouth-system-theme(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-theme-fade-in = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-fade-in-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-fade-in = "plymouth-scripts ( ) /bin/sh ( ) plymouth-plugin-fade-throbber ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-theme-fade-in = "plymouth-theme-fade-in ( =  24.004.60-13.el10.alma.1) plymouth-theme-fade-in(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-theme-script = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-script-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-script = "plymouth-scripts ( ) plymouth-plugin-script ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-theme-script = "plymouth-theme-script ( =  24.004.60-13.el10.alma.1) plymouth-theme-script(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-theme-solar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-solar-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-solar = "plymouth-scripts ( ) /bin/sh ( ) plymouth-plugin-space-flares ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-theme-solar = "plymouth-theme-solar ( =  24.004.60-13.el10.alma.1) plymouth-theme-solar(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-theme-spinfinity = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-spinfinity-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-spinfinity = "plymouth-scripts ( ) /bin/sh ( ) plymouth-plugin-two-step ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-theme-spinfinity = "plymouth-theme-spinfinity ( =  24.004.60-13.el10.alma.1) plymouth-theme-spinfinity(x86-64) ( =  24.004.60-13.el10.alma.1)"

URI_plymouth-theme-spinner = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plymouth-theme-spinner-24.004.60-13.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:plymouth-theme-spinner = "/bin/sh ( ) plymouth-scripts ( ) font(redhatmonovf) ( ) font(redhattextvf) ( ) plymouth-plugin-two-step ( =  24.004.60-13.el10.alma.1)"
RPROVIDES:plymouth-theme-spinner = "plymouth(system-theme) ( =  24.004.60-13.el10.alma.1) plymouth-theme-spinner ( =  24.004.60-13.el10.alma.1) plymouth-theme-spinner(x86-64) ( =  24.004.60-13.el10.alma.1)"

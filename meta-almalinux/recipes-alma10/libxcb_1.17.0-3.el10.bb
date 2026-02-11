
PN = "libxcb"
PE = "0"
PV = "1.17.0"
PR = "3.el10"
PACKAGES = "libxcb libxcb-devel libxcb-doc"


URI_libxcb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcb-1.17.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libXau.so.6()(64bit) ( )"
RPROVIDES:libxcb = "libxcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libxcb-randr.so.0()(64bit) ( ) libxcb-sync.so.1()(64bit) ( ) libxcb-xfixes.so.0()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) libxcb-present.so.0()(64bit) ( ) libxcb-dri2.so.0()(64bit) ( ) libxcb-render.so.0()(64bit) ( ) libxcb-glx.so.0()(64bit) ( ) libxcb-xkb.so.1()(64bit) ( ) libxcb-res.so.0()(64bit) ( ) libxcb-shape.so.0()(64bit) ( ) libxcb-composite.so.0()(64bit) ( ) libxcb-damage.so.0()(64bit) ( ) libxcb-dbe.so.0()(64bit) ( ) libxcb-dpms.so.0()(64bit) ( ) libxcb-record.so.0()(64bit) ( ) libxcb-screensaver.so.0()(64bit) ( ) libxcb-xf86dri.so.0()(64bit) ( ) libxcb-xinerama.so.0()(64bit) ( ) libxcb-xinput.so.0()(64bit) ( ) libxcb-xselinux.so.0()(64bit) ( ) libxcb-xtest.so.0()(64bit) ( ) libxcb-xv.so.0()(64bit) ( ) libxcb-xvmc.so.0()(64bit) ( ) libxcb(x86-64) ( =  1.17.0-3.el10) libxcb ( =  1.17.0-3.el10)"

URI_libxcb-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcb-devel-1.17.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcb-devel = "/usr/bin/pkg-config ( ) libxcb.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libxcb-randr.so.0()(64bit) ( ) libxcb-sync.so.1()(64bit) ( ) libxcb-xfixes.so.0()(64bit) ( ) libxcb-dri3.so.0()(64bit) ( ) libxcb-present.so.0()(64bit) ( ) libxcb-dri2.so.0()(64bit) ( ) libxcb-render.so.0()(64bit) ( ) pkgconfig(xcb) ( ) libxcb-glx.so.0()(64bit) ( ) libxcb-xkb.so.1()(64bit) ( ) pkgconfig(xcb-render) ( ) pkgconfig(xcb-shm) ( ) libxcb-res.so.0()(64bit) ( ) libxcb-shape.so.0()(64bit) ( ) libxcb-composite.so.0()(64bit) ( ) libxcb-damage.so.0()(64bit) ( ) libxcb-dbe.so.0()(64bit) ( ) libxcb-dpms.so.0()(64bit) ( ) libxcb-record.so.0()(64bit) ( ) libxcb-screensaver.so.0()(64bit) ( ) libxcb-xf86dri.so.0()(64bit) ( ) libxcb-xinerama.so.0()(64bit) ( ) libxcb-xinput.so.0()(64bit) ( ) libxcb-xselinux.so.0()(64bit) ( ) libxcb-xtest.so.0()(64bit) ( ) libxcb-xv.so.0()(64bit) ( ) libxcb-xvmc.so.0()(64bit) ( ) pkgconfig(xcb-dri3) ( ) pkgconfig(xcb-randr) ( ) pkgconfig(xcb-shape) ( ) pkgconfig(xcb-sync) ( ) pkgconfig(xcb-xfixes) ( ) pkgconfig(xcb-xv) ( ) libxcb(x86-64) ( =  1.17.0-3.el10) pkgconfig(xau) ( >=  0.99.2)"
RPROVIDES:libxcb-devel = "libxcb-devel ( =  1.17.0-3.el10) libxcb-devel(x86-64) ( =  1.17.0-3.el10) pkgconfig(pthread-stubs) ( =  0.1) pkgconfig(xcb) ( =  1.17.0) pkgconfig(xcb-composite) ( =  1.17.0) pkgconfig(xcb-damage) ( =  1.17.0) pkgconfig(xcb-dbe) ( =  1.17.0) pkgconfig(xcb-dpms) ( =  1.17.0) pkgconfig(xcb-dri2) ( =  1.17.0) pkgconfig(xcb-dri3) ( =  1.17.0) pkgconfig(xcb-glx) ( =  1.17.0) pkgconfig(xcb-present) ( =  1.17.0) pkgconfig(xcb-randr) ( =  1.17.0) pkgconfig(xcb-record) ( =  1.17.0) pkgconfig(xcb-render) ( =  1.17.0) pkgconfig(xcb-res) ( =  1.17.0) pkgconfig(xcb-screensaver) ( =  1.17.0) pkgconfig(xcb-shape) ( =  1.17.0) pkgconfig(xcb-shm) ( =  1.17.0) pkgconfig(xcb-sync) ( =  1.17.0) pkgconfig(xcb-xf86dri) ( =  1.17.0) pkgconfig(xcb-xfixes) ( =  1.17.0) pkgconfig(xcb-xinerama) ( =  1.17.0) pkgconfig(xcb-xinput) ( =  1.17.0) pkgconfig(xcb-xkb) ( =  1.17.0) pkgconfig(xcb-xselinux) ( =  1.17.0) pkgconfig(xcb-xtest) ( =  1.17.0) pkgconfig(xcb-xv) ( =  1.17.0) pkgconfig(xcb-xvmc) ( =  1.17.0)"

URI_libxcb-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxcb-doc-1.17.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libxcb-doc = ""
RPROVIDES:libxcb-doc = "libxcb-doc ( =  1.17.0-3.el10)"

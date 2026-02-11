
PN = "colord"
PE = "0"
PV = "1.4.7"
PR = "6.el10"
PACKAGES = "colord colord-libs colord-devel colord-devel-docs colord-extra-profiles colord-tests"


URI_colord = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) liblcms2.so.2()(64bit) ( ) libcolord.so.2()(64bit) ( ) libgusb.so.2()(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.0)(64bit) ( ) color-filesystem ( ) libgusb.so.2(LIBGUSB_0.2.2)(64bit) ( ) libcolordprivate.so.2()(64bit) ( ) libcolorhug.so.2()(64bit) ( ) colord-libs(x86-64) ( =  1.4.7-6.el10)"
RPROVIDES:colord = "group(colord) ( ) shared-color-profiles ( ) libcolord_sensor_argyll.so()(64bit) ( ) libcolord_sensor_camera.so()(64bit) ( ) libcolord_sensor_colorhug.so()(64bit) ( ) libcolord_sensor_dtp94.so()(64bit) ( ) libcolord_sensor_dummy.so()(64bit) ( ) libcolord_sensor_huey.so()(64bit) ( ) libcolord_sensor_scanner.so()(64bit) ( ) colord ( =  1.4.7-6.el10) colord(x86-64) ( =  1.4.7-6.el10) user(colord) ( =  dSBjb2xvcmQgLSAiVXNlciBmb3IgY29sb3JkIiAvdmFyL2xpYi9jb2xvcmQgL3NiaW4vbm9sb2dpbgAA)"

URI_colord-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/colord-libs-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) liblcms2.so.2()(64bit) ( ) libgusb.so.2()(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.0)(64bit) ( ) libudev.so.1(LIBUDEV_196)(64bit) ( ) libgusb.so.2(LIBGUSB_0.1.1)(64bit) ( )"
RPROVIDES:colord-libs = "libcolord.so.2()(64bit) ( ) libcolordprivate.so.2()(64bit) ( ) libcolorhug.so.2()(64bit) ( ) colord-libs(x86-64) ( =  1.4.7-6.el10) colord-libs ( =  1.4.7-6.el10)"

URI_colord-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/colord-devel-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(colord) ( ) pkgconfig(gusb) ( ) libcolord.so.2()(64bit) ( ) libcolordprivate.so.2()(64bit) ( ) libcolorhug.so.2()(64bit) ( ) colord ( =  1.4.7-6.el10) colord-libs ( =  1.4.7-6.el10)"
RPROVIDES:colord-devel = "colord-devel ( =  1.4.7-6.el10) colord-devel(x86-64) ( =  1.4.7-6.el10) pkgconfig(colord) ( =  1.4.7) pkgconfig(colorhug) ( =  1.4.7)"

URI_colord-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/colord-devel-docs-1.4.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:colord-devel-docs = "colord ( =  1.4.7-6.el10)"
RPROVIDES:colord-devel-docs = "colord-devel-docs ( =  1.4.7-6.el10)"

URI_colord-extra-profiles = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/colord-extra-profiles-1.4.7-6.el10.noarch.rpm;unpack=0"
RDEPENDS:colord-extra-profiles = "colord ( =  1.4.7-6.el10)"
RPROVIDES:colord-extra-profiles = "shared-color-profiles-extra ( ) colord-extra-profiles ( =  1.4.7-6.el10)"

URI_colord-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/colord-tests-1.4.7-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:colord-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcolord.so.2()(64bit) ( ) liblcms2.so.2()(64bit) ( ) libcolordprivate.so.2()(64bit) ( )"
RPROVIDES:colord-tests = "colord-tests ( =  1.4.7-6.el10) colord-tests(x86-64) ( =  1.4.7-6.el10)"


PN = "ndctl"
PE = "0"
PV = "80"
PR = "3.el10"
PACKAGES = "cxl-libs daxctl-libs ndctl ndctl-libs cxl-cli daxctl daxctl-devel ndctl-devel cxl-devel"


URI_cxl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cxl-libs-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cxl-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( ) libdaxctl.so.1()(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_2)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_1)(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:cxl-libs = "libcxl.so.1()(64bit) ( ) libcxl.so.1(LIBCXL_1)(64bit) ( ) libcxl.so.1(LIBCXL_2)(64bit) ( ) libcxl.so.1(LIBCXL_3)(64bit) ( ) libcxl.so.1(LIBCXL_4)(64bit) ( ) libcxl.so.1(LIBCXL_5)(64bit) ( ) libcxl.so.1(LIBCXL_6)(64bit) ( ) libcxl.so.1(LIBCXL_7)(64bit) ( ) libcxl.so.1(LIBECXL_8)(64bit) ( ) cxl-libs(x86-64) ( =  80-3.el10) cxl-libs ( =  80-3.el10)"

URI_daxctl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/daxctl-libs-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:daxctl-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( )"
RPROVIDES:daxctl-libs = "libdaxctl.so.1()(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_2)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_1)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_3)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_4)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_6)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_7)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_8)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_9)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_10)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_5)(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10) daxctl-libs ( =  80-3.el10)"

URI_ndctl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ndctl-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ndctl = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkeyutils.so.1()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libjson-c.so.5(JSONC_PRIVATE)(64bit) ( ) libdaxctl.so.1()(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_2)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_3)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_4)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_6)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_7)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_8)(64bit) ( ) libiniparser.so.1()(64bit) ( ) libndctl.so.6()(64bit) ( ) libndctl.so.6(LIBNDCTL_1)(64bit) ( ) libndctl.so.6(LIBNDCTL_13)(64bit) ( ) libndctl.so.6(LIBNDCTL_14)(64bit) ( ) libndctl.so.6(LIBNDCTL_15)(64bit) ( ) libndctl.so.6(LIBNDCTL_16)(64bit) ( ) libndctl.so.6(LIBNDCTL_17)(64bit) ( ) libndctl.so.6(LIBNDCTL_18)(64bit) ( ) libndctl.so.6(LIBNDCTL_19)(64bit) ( ) libndctl.so.6(LIBNDCTL_20)(64bit) ( ) libndctl.so.6(LIBNDCTL_21)(64bit) ( ) libndctl.so.6(LIBNDCTL_22)(64bit) ( ) libndctl.so.6(LIBNDCTL_23)(64bit) ( ) libndctl.so.6(LIBNDCTL_24)(64bit) ( ) libndctl.so.6(LIBNDCTL_25)(64bit) ( ) libndctl.so.6(LIBNDCTL_26)(64bit) ( ) libndctl.so.6(LIBNDCTL_27)(64bit) ( ) libndctl.so.6(LIBNDCTL_28)(64bit) ( ) libndctl.so.6(LIBNDCTL_3)(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10) cxl-libs(x86-64) ( =  80-3.el10) ndctl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:ndctl = "config(ndctl) ( =  80-3.el10) ndctl ( =  80-3.el10) ndctl(x86-64) ( =  80-3.el10)"

URI_ndctl-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ndctl-libs-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ndctl-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( ) libdaxctl.so.1()(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_2)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_1)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_9)(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:ndctl-libs = "libndctl.so.6()(64bit) ( ) libndctl.so.6(LIBNDCTL_1)(64bit) ( ) libndctl.so.6(LIBNDCTL_13)(64bit) ( ) libndctl.so.6(LIBNDCTL_14)(64bit) ( ) libndctl.so.6(LIBNDCTL_15)(64bit) ( ) libndctl.so.6(LIBNDCTL_16)(64bit) ( ) libndctl.so.6(LIBNDCTL_17)(64bit) ( ) libndctl.so.6(LIBNDCTL_18)(64bit) ( ) libndctl.so.6(LIBNDCTL_19)(64bit) ( ) libndctl.so.6(LIBNDCTL_20)(64bit) ( ) libndctl.so.6(LIBNDCTL_21)(64bit) ( ) libndctl.so.6(LIBNDCTL_22)(64bit) ( ) libndctl.so.6(LIBNDCTL_23)(64bit) ( ) libndctl.so.6(LIBNDCTL_24)(64bit) ( ) libndctl.so.6(LIBNDCTL_25)(64bit) ( ) libndctl.so.6(LIBNDCTL_26)(64bit) ( ) libndctl.so.6(LIBNDCTL_27)(64bit) ( ) libndctl.so.6(LIBNDCTL_28)(64bit) ( ) libndctl.so.6(LIBNDCTL_3)(64bit) ( ) ndctl-libs(x86-64) ( =  80-3.el10) ndctl-libs ( =  80-3.el10)"

URI_cxl-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cxl-cli-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cxl-cli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtraceevent.so.1()(64bit) ( ) libuuid.so.1()(64bit) ( ) libtracefs.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libdaxctl.so.1()(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_2)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_3)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_4)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_6)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_7)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_8)(64bit) ( ) libjson-c.so.5(JSONC_PRIVATE)(64bit) ( ) libcxl.so.1()(64bit) ( ) libcxl.so.1(LIBCXL_1)(64bit) ( ) libcxl.so.1(LIBCXL_2)(64bit) ( ) libcxl.so.1(LIBCXL_3)(64bit) ( ) libcxl.so.1(LIBCXL_4)(64bit) ( ) libcxl.so.1(LIBCXL_5)(64bit) ( ) libcxl.so.1(LIBCXL_6)(64bit) ( ) libcxl.so.1(LIBCXL_7)(64bit) ( ) libcxl.so.1(LIBECXL_8)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_10)(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10) cxl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:cxl-cli = "cxl-cli ( =  80-3.el10) cxl-cli(x86-64) ( =  80-3.el10)"

URI_daxctl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/daxctl-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:daxctl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libndctl.so.6()(64bit) ( ) libndctl.so.6(LIBNDCTL_1)(64bit) ( ) libndctl.so.6(LIBNDCTL_3)(64bit) ( ) libdaxctl.so.1()(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_2)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_3)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_4)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_6)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_7)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_8)(64bit) ( ) libjson-c.so.5(JSONC_PRIVATE)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_1)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_5)(64bit) ( ) libdaxctl.so.1(LIBDAXCTL_9)(64bit) ( ) libiniparser.so.1()(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10) ndctl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:daxctl = "config(daxctl) ( =  80-3.el10) daxctl ( =  80-3.el10) daxctl(x86-64) ( =  80-3.el10)"

URI_daxctl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/daxctl-devel-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:daxctl-devel = "/usr/bin/pkg-config ( ) libdaxctl.so.1()(64bit) ( ) daxctl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:daxctl-devel = "daxctl-devel ( =  80-3.el10) daxctl-devel(x86-64) ( =  80-3.el10) pkgconfig(libdaxctl) ( =  80)"

URI_ndctl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ndctl-devel-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ndctl-devel = "/usr/bin/pkg-config ( ) libndctl.so.6()(64bit) ( ) ndctl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:ndctl-devel = "ndctl-devel ( =  80-3.el10) ndctl-devel(x86-64) ( =  80-3.el10) pkgconfig(libndctl) ( =  80)"

URI_cxl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cxl-devel-80-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cxl-devel = "/usr/bin/pkg-config ( ) libcxl.so.1()(64bit) ( ) cxl-libs(x86-64) ( =  80-3.el10)"
RPROVIDES:cxl-devel = "cxl-devel ( =  80-3.el10) cxl-devel(x86-64) ( =  80-3.el10) pkgconfig(libcxl) ( =  80)"

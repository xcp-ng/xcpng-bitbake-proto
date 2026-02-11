
PN = "libnvme"
PE = "0"
PV = "1.11.1"
PR = "1.el10"
PACKAGES = "libnvme python3-libnvme libnvme-devel libnvme-doc"


URI_libnvme = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnvme-1.11.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnvme = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libkeyutils.so.1()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libkeyutils.so.1(KEYUTILS_0.3)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.5)(64bit) ( ) libkeyutils.so.1(KEYUTILS_1.4)(64bit) ( )"
RPROVIDES:libnvme = "libnvme.so.1()(64bit) ( ) libnvme.so.1(LIBNVME_1_0)(64bit) ( ) libnvme-mi.so.1()(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_1)(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_10)(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_2)(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_3)(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_4)(64bit) ( ) libnvme.so.1(LIBNVME_1.10)(64bit) ( ) libnvme.so.1(LIBNVME_1.11)(64bit) ( ) libnvme.so.1(LIBNVME_1.9)(64bit) ( ) libnvme.so.1(LIBNVME_1_2)(64bit) ( ) libnvme.so.1(LIBNVME_1_3)(64bit) ( ) libnvme.so.1(LIBNVME_1_4)(64bit) ( ) libnvme.so.1(LIBNVME_1_5)(64bit) ( ) libnvme.so.1(LIBNVME_1_6)(64bit) ( ) libnvme.so.1(LIBNVME_1_7)(64bit) ( ) libnvme.so.1(LIBNVME_1_8)(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_11)(64bit) ( ) libnvme-mi.so.1(LIBNVME_MI_1_5)(64bit) ( ) libnvme.so.1(LIBNVME_1_1)(64bit) ( ) libnvme ( =  1.11.1-1.el10) libnvme(x86-64) ( =  1.11.1-1.el10)"

URI_python3-libnvme = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libnvme-1.11.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libnvme = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libnvme.so.1()(64bit) ( ) libnvme.so.1(LIBNVME_1_0)(64bit) ( ) libnvme.so.1(LIBNVME_1_2)(64bit) ( ) libnvme.so.1(LIBNVME_1_5)(64bit) ( ) python(abi) ( =  3.12) libnvme(x86-64) ( =  1.11.1-1.el10)"
RPROVIDES:python3-libnvme = "python-libnvme ( =  1.11.1-1.el10) python3-libnvme ( =  1.11.1-1.el10) python3-libnvme(x86-64) ( =  1.11.1-1.el10) python3-nvme ( =  1.11.1-1.el10) python3.12-libnvme ( =  1.11.1-1.el10)"

URI_libnvme-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnvme-devel-1.11.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnvme-devel = "/usr/bin/pkg-config ( ) pkgconfig(dbus-1) ( ) libnvme-mi.so.1()(64bit) ( ) libnvme.so.1()(64bit) ( ) pkgconfig(libkeyutils) ( ) libnvme(x86-64) ( =  1.11.1-1.el10) pkgconfig(json-c) ( >=  0.13) pkgconfig(openssl) ( >=  1.1.0)"
RPROVIDES:libnvme-devel = "libnvme-devel ( =  1.11.1-1.el10) libnvme-devel(x86-64) ( =  1.11.1-1.el10) pkgconfig(libnvme) ( =  1.11.1) pkgconfig(libnvme-mi) ( =  1.11.1)"

URI_libnvme-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnvme-doc-1.11.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libnvme-doc = ""
RPROVIDES:libnvme-doc = "libnvme-doc ( =  1.11.1-1.el10)"

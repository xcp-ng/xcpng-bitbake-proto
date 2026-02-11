
PN = "python3.12"
PE = "0"
PV = "3.12.9"
PR = "2.el10_0.3"
PACKAGES = "python3 python3-libs python-unversioned-command python3-devel python3-tkinter python3-debug python3-idle python3-test"


URI_python3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) python3-libs(x86-64) ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python3 = "python(abi) ( =  3.12) python3(x86-64) ( =  3.12.9-2.el10_0.3) platform-python ( =  3.12.9-2.el10_0.3) platform-python(x86-64) ( =  3.12.9-2.el10_0.3) python3 ( =  3.12.9-2.el10_0.3) python3.12 ( =  3.12.9-2.el10_0.3) python3.12(x86-64) ( =  3.12.9-2.el10_0.3) python312 ( =  3.12.9-2.el10_0.3)"

URI_python3-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libs-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libncursesw.so.6()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libreadline.so.8()(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libuuid.so.1()(64bit) ( ) libpanelw.so.6()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libbz2.so.1()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libexpat.so.1()(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) tzdata ( ) libgdbm.so.6()(64bit) ( ) libgdbm_compat.so.4()(64bit) ( ) libmpdec.so.3()(64bit) ( ) libuuid.so.1(UUID_2.20)(64bit) ( ) expat ( >=  2.6) python3-pip-wheel ( >=  23.1.2)"
RPROVIDES:python3-libs = "libpython3.12.so.1.0()(64bit) ( ) libpython3.so()(64bit) ( ) bundled(libb2) ( =  0.98.1) python3-libs(x86-64) ( =  3.12.9-2.el10_0.3) python-libs ( =  3.12.9-2.el10_0.3) python3-libs ( =  3.12.9-2.el10_0.3) python3.12-libs ( =  3.12.9-2.el10_0.3)"

URI_python-unversioned-command = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-unversioned-command-3.12.9-2.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:python-unversioned-command = "python3 ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python-unversioned-command = "python ( =  3.12.9-2.el10_0.3) python-is-python3 ( =  3.12.9-2.el10_0.3) python-unversioned-command ( =  3.12.9-2.el10_0.3)"

URI_python3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-devel-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) libpython3.12.so.1.0()(64bit) ( ) python-rpm-macros ( if  rpm-build) python3-rpm-generators ( if  rpm-build) python3-rpm-macros ( if  rpm-build) python3 ( =  3.12.9-2.el10_0.3) python3-libs(x86-64) ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python3-devel = "pkgconfig(python) ( =  3.12) pkgconfig(python-3.12) ( =  3.12) pkgconfig(python-3.12-embed) ( =  3.12) pkgconfig(python3) ( =  3.12) pkgconfig(python3-embed) ( =  3.12) 2to3 ( =  3.12.9-2.el10_0.3) platform-python-devel ( =  3.12.9-2.el10_0.3) platform-python-devel(x86-64) ( =  3.12.9-2.el10_0.3) python-devel ( =  3.12.9-2.el10_0.3) python3-2to3 ( =  3.12.9-2.el10_0.3) python3-devel ( =  3.12.9-2.el10_0.3) python3-devel(x86-64) ( =  3.12.9-2.el10_0.3) python3.12-devel ( =  3.12.9-2.el10_0.3)"

URI_python3-tkinter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tkinter-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tkinter = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libtcl8.6.so()(64bit) ( ) libtk8.6.so()(64bit) ( ) python3 ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python3-tkinter = "python3-tkinter(x86-64) ( =  3.12.9-2.el10_0.3) python-tkinter ( =  3.12.9-2.el10_0.3) python-turtle ( =  3.12.9-2.el10_0.3) python3-tkinter ( =  3.12.9-2.el10_0.3) python3-turtle ( =  3.12.9-2.el10_0.3) python3.12-tkinter ( =  3.12.9-2.el10_0.3) python3.12-turtle ( =  3.12.9-2.el10_0.3)"

URI_python3-debug = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-debug-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-debug = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libmpdec.so.3()(64bit) ( ) libncursesw.so.6()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libgdbm.so.6()(64bit) ( ) libgdbm_compat.so.4()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libtcl8.6.so()(64bit) ( ) libtk8.6.so()(64bit) ( ) libbz2.so.1()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libexpat.so.1()(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libpanelw.so.6()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_2.20)(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) python3-libs(x86-64) ( =  3.12.9-2.el10_0.3) python3-idle(x86-64) ( =  3.12.9-2.el10_0.3) python3-test(x86-64) ( =  3.12.9-2.el10_0.3) python3(x86-64) ( =  3.12.9-2.el10_0.3) python3-tkinter(x86-64) ( =  3.12.9-2.el10_0.3) python3-devel(x86-64) ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python3-debug = "libpython3.12d.so.1.0()(64bit) ( ) pkgconfig(python-3.12d) ( =  3.12) pkgconfig(python-3.12d-embed) ( =  3.12) platform-python-debug ( =  3.12.9-2.el10_0.3) platform-python-debug(x86-64) ( =  3.12.9-2.el10_0.3) python-debug ( =  3.12.9-2.el10_0.3) python3-debug ( =  3.12.9-2.el10_0.3) python3-debug(x86-64) ( =  3.12.9-2.el10_0.3) python3.12-debug ( =  3.12.9-2.el10_0.3)"

URI_python3-idle = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-idle-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-idle = "python3 ( =  3.12.9-2.el10_0.3) python3-tkinter ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python3-idle = "application() ( ) metainfo() ( ) application(idle3.desktop) ( ) metainfo(idle3.appdata.xml) ( ) mimehandler(text/x-python) ( ) python3-idle(x86-64) ( =  3.12.9-2.el10_0.3) idle ( =  3.12.9-2.el10_0.3) idle3 ( =  3.12.9-2.el10_0.3) python-idle ( =  3.12.9-2.el10_0.3) python3-idle ( =  3.12.9-2.el10_0.3) python3-tools ( =  3.12.9-2.el10_0.3) python3-tools(x86-64) ( =  3.12.9-2.el10_0.3) python3.12-idle ( =  3.12.9-2.el10_0.3)"

URI_python3-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-test-3.12.9-2.el10_0.3.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-test = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) /usr/bin/bash ( ) python3-setuptools-wheel ( ) python3-wheel-wheel ( ) python3 ( =  3.12.9-2.el10_0.3) python3-libs(x86-64) ( =  3.12.9-2.el10_0.3)"
RPROVIDES:python3-test = "python3-test(x86-64) ( =  3.12.9-2.el10_0.3) python-test ( =  3.12.9-2.el10_0.3) python3-test ( =  3.12.9-2.el10_0.3) python3.12-test ( =  3.12.9-2.el10_0.3)"

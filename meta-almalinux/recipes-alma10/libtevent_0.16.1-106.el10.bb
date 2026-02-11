
PN = "libtevent"
PE = "0"
PV = "0.16.1"
PR = "106.el10"
PACKAGES = "libtevent python3-tevent libtevent-devel"


URI_libtevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtevent-0.16.1-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtevent = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libtalloc.so.2()(64bit) ( ) libtalloc.so.2(TALLOC_2.0.2)(64bit) ( ) libtalloc.so.2(TALLOC_2.1.0)(64bit) ( )"
RPROVIDES:libtevent = "libtevent.so.0()(64bit) ( ) libtevent.so.0(TEVENT_0.9.9)(64bit) ( ) libtevent.so.0(TEVENT_0.15.0)(64bit) ( ) bundled(libreplace) ( ) libtevent.so.0(TEVENT_0.9.16)(64bit) ( ) libtevent.so.0(TEVENT_0.9.12)(64bit) ( ) libtevent.so.0(TEVENT_0.9.13)(64bit) ( ) libtevent.so.0(TEVENT_0.9.20)(64bit) ( ) libtevent.so.0(TEVENT_0.9.31)(64bit) ( ) libtevent.so.0(TEVENT_0.11.0)(64bit) ( ) libtevent.so.0(TEVENT_0.12.0)(64bit) ( ) libtevent.so.0(TEVENT_0.9.37)(64bit) ( ) libtevent.so.0(TEVENT_0.13.0)(64bit) ( ) libtevent.so.0(TEVENT_0.9.30)(64bit) ( ) libtevent.so.0(TEVENT_0.9.36)(64bit) ( ) libtevent.so.0(TEVENT_0.10.0)(64bit) ( ) libtevent.so.0(TEVENT_0.10.1)(64bit) ( ) libtevent.so.0(TEVENT_0.10.2)(64bit) ( ) libtevent.so.0(TEVENT_0.12.1)(64bit) ( ) libtevent.so.0(TEVENT_0.14.0)(64bit) ( ) libtevent.so.0(TEVENT_0.14.1)(64bit) ( ) libtevent.so.0(TEVENT_0.16.0)(64bit) ( ) libtevent.so.0(TEVENT_0.16.1)(64bit) ( ) libtevent.so.0(TEVENT_0.9.10)(64bit) ( ) libtevent.so.0(TEVENT_0.9.11)(64bit) ( ) libtevent.so.0(TEVENT_0.9.14)(64bit) ( ) libtevent.so.0(TEVENT_0.9.15)(64bit) ( ) libtevent.so.0(TEVENT_0.9.17)(64bit) ( ) libtevent.so.0(TEVENT_0.9.18)(64bit) ( ) libtevent.so.0(TEVENT_0.9.19)(64bit) ( ) libtevent.so.0(TEVENT_0.9.21)(64bit) ( ) libtevent.so.0(TEVENT_0.9.22)(64bit) ( ) libtevent.so.0(TEVENT_0.9.23)(64bit) ( ) libtevent.so.0(TEVENT_0.9.24)(64bit) ( ) libtevent.so.0(TEVENT_0.9.25)(64bit) ( ) libtevent.so.0(TEVENT_0.9.26)(64bit) ( ) libtevent.so.0(TEVENT_0.9.27)(64bit) ( ) libtevent.so.0(TEVENT_0.9.28)(64bit) ( ) libtevent.so.0(TEVENT_0.9.29)(64bit) ( ) libtevent.so.0(TEVENT_0.9.32)(64bit) ( ) libtevent.so.0(TEVENT_0.9.33)(64bit) ( ) libtevent.so.0(TEVENT_0.9.34)(64bit) ( ) libtevent.so.0(TEVENT_0.9.35)(64bit) ( ) libtevent.so.0(TEVENT_0.9.38)(64bit) ( ) libtevent.so.0(TEVENT_0.9.39)(64bit) ( ) libtevent(x86-64) ( =  0.16.1-106.el10) libtevent ( =  0.16.1-106.el10)"

URI_python3-tevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-tevent-0.16.1-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tevent = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libtalloc.so.2()(64bit) ( ) libtalloc.so.2(TALLOC_2.0.2)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libtevent.so.0()(64bit) ( ) libtevent.so.0(TEVENT_0.9.9)(64bit) ( ) libtevent.so.0(TEVENT_0.15.0)(64bit) ( ) python(abi) ( =  3.12) libtevent(x86-64) ( =  0.16.1-106.el10)"
RPROVIDES:python3-tevent = "python-tevent ( =  0.16.1-106.el10) python3-tevent ( =  0.16.1-106.el10) python3-tevent(x86-64) ( =  0.16.1-106.el10) python3.12-tevent ( =  0.16.1-106.el10)"

URI_libtevent-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtevent-devel-0.16.1-106.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtevent-devel = "/usr/bin/pkg-config ( ) pkgconfig(talloc) ( ) libtevent.so.0()(64bit) ( ) libtalloc-devel(x86-64) ( >=  2.4.2) libtevent(x86-64) ( =  0.16.1-106.el10)"
RPROVIDES:libtevent-devel = "libtevent-devel ( =  0.16.1-106.el10) libtevent-devel(x86-64) ( =  0.16.1-106.el10) pkgconfig(tevent) ( =  0.16.1)"

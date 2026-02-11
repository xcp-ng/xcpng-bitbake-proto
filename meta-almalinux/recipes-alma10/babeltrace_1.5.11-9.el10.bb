
PN = "babeltrace"
PE = "0"
PV = "1.5.11"
PR = "9.el10"
PACKAGES = "libbabeltrace libbabeltrace-devel python3-babeltrace babeltrace"


URI_libbabeltrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libbabeltrace-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbabeltrace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libdw.so.1()(64bit) ( ) libdw.so.1(ELFUTILS_0.122)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libpopt.so.0()(64bit) ( )"
RPROVIDES:libbabeltrace = "libbabeltrace-ctf.so.1()(64bit) ( ) libbabeltrace.so.1()(64bit) ( ) libbabeltrace-ctf-metadata.so.1()(64bit) ( ) libbabeltrace-ctf-text.so.1()(64bit) ( ) libbabeltrace-dummy.so.1()(64bit) ( ) libbabeltrace-lttng-live.so.1()(64bit) ( ) libbabeltrace ( =  1.5.11-9.el10) libbabeltrace(x86-64) ( =  1.5.11-9.el10)"

URI_libbabeltrace-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libbabeltrace-devel-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libbabeltrace-devel = "/usr/bin/pkg-config ( ) glib2-devel ( ) pkgconfig(uuid) ( ) libbabeltrace-ctf.so.1()(64bit) ( ) libbabeltrace.so.1()(64bit) ( ) pkgconfig(babeltrace) ( ) libbabeltrace-ctf-metadata.so.1()(64bit) ( ) libbabeltrace-ctf-text.so.1()(64bit) ( ) libbabeltrace-dummy.so.1()(64bit) ( ) libbabeltrace-lttng-live.so.1()(64bit) ( ) pkgconfig(popt) ( ) libbabeltrace(x86-64) ( =  1.5.11-9.el10)"
RPROVIDES:libbabeltrace-devel = "libbabeltrace-devel ( =  1.5.11-9.el10) libbabeltrace-devel(x86-64) ( =  1.5.11-9.el10) pkgconfig(babeltrace) ( =  1.5.11) pkgconfig(babeltrace-ctf) ( =  1.5.11)"

URI_python3-babeltrace = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-babeltrace-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-babeltrace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libbabeltrace-ctf.so.1()(64bit) ( ) libbabeltrace.so.1()(64bit) ( ) python(abi) ( =  3.12) libbabeltrace(x86-64) ( =  1.5.11-9.el10)"
RPROVIDES:python3-babeltrace = "python-babeltrace ( =  1.5.11-9.el10) python3-babeltrace ( =  1.5.11-9.el10) python3-babeltrace(x86-64) ( =  1.5.11-9.el10) python3.12-babeltrace ( =  1.5.11-9.el10) python3.12dist(babeltrace) ( =  1.5.11) python3dist(babeltrace) ( =  1.5.11)"

URI_babeltrace = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babeltrace-1.5.11-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:babeltrace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libuuid.so.1()(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libbabeltrace-ctf-metadata.so.1()(64bit) ( ) libbabeltrace-ctf-text.so.1()(64bit) ( ) libbabeltrace-ctf.so.1()(64bit) ( ) libbabeltrace-dummy.so.1()(64bit) ( ) libbabeltrace-lttng-live.so.1()(64bit) ( ) libbabeltrace.so.1()(64bit) ( ) libbabeltrace(x86-64) ( =  1.5.11-9.el10)"
RPROVIDES:babeltrace = "babeltrace ( =  1.5.11-9.el10) babeltrace(x86-64) ( =  1.5.11-9.el10)"

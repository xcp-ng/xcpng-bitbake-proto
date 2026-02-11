
PN = "lttng-ust"
PE = "0"
PV = "2.13.7"
PR = "5.el10"
PACKAGES = "lttng-ust lttng-ust-devel python3-lttngust"


URI_lttng-ust = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lttng-ust-2.13.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lttng-ust = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libnuma.so.1()(64bit) ( ) libnuma.so.1(libnuma_1.1)(64bit) ( ) libnuma.so.1(libnuma_1.2)(64bit) ( )"
RPROVIDES:lttng-ust = "liblttng-ust-common.so.1()(64bit) ( ) liblttng-ust-ctl.so.5()(64bit) ( ) liblttng-ust-cyg-profile-fast.so.1()(64bit) ( ) liblttng-ust-cyg-profile.so.1()(64bit) ( ) liblttng-ust-dl.so.1()(64bit) ( ) liblttng-ust-fd.so.1()(64bit) ( ) liblttng-ust-fork.so.1()(64bit) ( ) liblttng-ust-libc-wrapper.so.1()(64bit) ( ) liblttng-ust-pthread-wrapper.so.1()(64bit) ( ) liblttng-ust-python-agent.so.1()(64bit) ( ) liblttng-ust-tracepoint.so.1()(64bit) ( ) liblttng-ust.so.1()(64bit) ( ) lttng-ust(x86-64) ( =  2.13.7-5.el10) lttng-ust ( =  2.13.7-5.el10)"

URI_lttng-ust-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lttng-ust-devel-2.13.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lttng-ust-devel = "/usr/bin/pkg-config ( ) /usr/bin/python3 ( ) userspace-rcu-devel ( ) liblttng-ust-common.so.1()(64bit) ( ) liblttng-ust-ctl.so.5()(64bit) ( ) liblttng-ust-cyg-profile-fast.so.1()(64bit) ( ) liblttng-ust-cyg-profile.so.1()(64bit) ( ) liblttng-ust-dl.so.1()(64bit) ( ) liblttng-ust-fd.so.1()(64bit) ( ) liblttng-ust-fork.so.1()(64bit) ( ) liblttng-ust-libc-wrapper.so.1()(64bit) ( ) liblttng-ust-pthread-wrapper.so.1()(64bit) ( ) liblttng-ust-python-agent.so.1()(64bit) ( ) liblttng-ust-tracepoint.so.1()(64bit) ( ) liblttng-ust.so.1()(64bit) ( ) systemtap-sdt-devel ( ) lttng-ust(x86-64) ( =  2.13.7-5.el10)"
RPROVIDES:lttng-ust-devel = "lttng-ust-devel ( =  2.13.7-5.el10) lttng-ust-devel(x86-64) ( =  2.13.7-5.el10) pkgconfig(lttng-ust) ( =  2.13.7) pkgconfig(lttng-ust-ctl) ( =  2.13.7)"

URI_python3-lttngust = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-lttngust-2.13.7-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-lttngust = "python(abi) ( =  3.12) lttng-ust(x86-64) ( =  2.13.7-5.el10)"
RPROVIDES:python3-lttngust = "python-lttngust ( =  2.13.7-5.el10) python3-lttngust ( =  2.13.7-5.el10) python3-lttngust(x86-64) ( =  2.13.7-5.el10) python3.12-lttngust ( =  2.13.7-5.el10) python3.12dist(lttngust) ( =  2.13.7) python3dist(lttngust) ( =  2.13.7)"

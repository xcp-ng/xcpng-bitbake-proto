
inherit dnf-bridge

PN = "systemtap"
PE = "0"
PV = "5.2"
PR = "2.el10"
PACKAGES = "systemtap systemtap-client systemtap-devel systemtap-exporter systemtap-initscript systemtap-runtime systemtap-runtime-java systemtap-runtime-python3 systemtap-runtime-virtguest systemtap-runtime-virthost systemtap-sdt-devel systemtap-sdt-dtrace systemtap-server systemtap-jupyter systemtap-testsuite"


URI_systemtap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap = " \
 bash \
 systemtap-client \
 systemtap-devel \
"

URI_systemtap-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-client-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-client = " \
 mokutil \
 nss \
 dyninst \
 systemtap-runtime \
 unzip \
 json-c \
 libstdc++ \
 sed \
 zip \
 openssh-clients \
 elfutils-debuginfod-client \
 libgcc \
 grep \
 elfutils-libelf \
 elfutils-libs \
 sqlite-libs \
 avahi-libs \
 bash \
 boost-system \
 readline \
 glibc \
 coreutils \
 perl-interpreter \
 rpm-libs \
 nspr \
"

URI_systemtap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-devel-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-devel = " \
 python3 \
 nss \
 dyninst \
 elfutils-devel \
 json-c \
 libstdc++ \
 gcc \
 elfutils-debuginfod-client \
 libgcc \
 elfutils-libelf \
 elfutils-libs \
 sqlite-libs \
 avahi-libs \
 bash \
 boost-system \
 readline \
 make \
 glibc \
 rpm-libs \
 nspr \
"

URI_systemtap-exporter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-exporter-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-exporter = " \
 python3 \
 systemtap-runtime \
 bash \
"

URI_systemtap-initscript = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-initscript-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-initscript = " \
 systemd \
 bash \
 systemtap \
"

URI_systemtap-runtime = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-runtime-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-runtime = " \
 shadow-utils \
 nss \
 elfutils-debuginfod-client \
 libgcc \
 json-c \
 elfutils-libelf \
 dyninst \
 libstdc++ \
 bash \
 ncurses-libs \
 glibc \
 libselinux \
 boost-system \
 nspr \
"

URI_systemtap-runtime-java = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-runtime-java-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-runtime-java = " \
 iproute \
 byteman \
 systemtap-runtime \
 java-21-openjdk-devel \
 bash \
 glibc \
"

URI_systemtap-runtime-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-runtime-python3-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-runtime-python3 = " \
 glibc \
 systemtap-runtime \
 python3 \
"

URI_systemtap-runtime-virtguest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-runtime-virtguest-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-runtime-virtguest = " \
 grep \
 systemtap-runtime \
 bash \
 coreutils \
 findutils \
"

URI_systemtap-runtime-virthost = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-runtime-virthost-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-runtime-virthost = " \
 glibc \
 libvirt-libs \
 libxml2 \
"

URI_systemtap-sdt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-sdt-devel-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-sdt-devel = " \
 python3 \
"

URI_systemtap-sdt-dtrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-sdt-dtrace-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-sdt-dtrace = " \
 python3 \
 python3-pyparsing \
"

URI_systemtap-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/systemtap-server-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-server = " \
 zip \
 shadow-utils \
 systemd \
 nss \
 unzip \
 openssl \
 libgcc \
 systemtap-devel \
 avahi-libs \
 libstdc++ \
 bash \
 glibc \
 coreutils \
 nspr \
"

URI_systemtap-jupyter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/systemtap-jupyter-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-jupyter = " \
 bash \
 systemtap \
"

URI_systemtap-testsuite = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/systemtap-testsuite-5.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:systemtap-testsuite = " \
 perf \
 glibc-devel \
 crash \
 systemtap \
 systemtap-client \
 tcl \
 systemtap-runtime-java \
 systemtap-runtime-python3 \
 systemtap-sdt-devel \
 systemtap-server \
 elfutils-debuginfod \
 tk \
 which \
 gcc \
 gcc-c++ \
 elfutils \
 grep \
 avahi \
 bash \
 coreutils \
 nmap-ncat \
 wget \
 gawk \
 make \
 strace \
 dejagnu \
 perl-interpreter \
"

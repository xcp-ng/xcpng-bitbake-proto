
PN = "tomcat9"
PE = "1"
PV = "9.0.87"
PR = "5.el10_0.3"
PACKAGES = "tomcat9 tomcat9-admin-webapps tomcat9-docs-webapp tomcat9-el-3.0-api tomcat9-jsp-2.3-api tomcat9-lib tomcat9-servlet-4.0-api tomcat9-webapps"


URI_tomcat9 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9 = " \
 shadow-utils \
 systemd \
 javapackages-tools \
 tomcat9-lib \
 bash \
 java-21-openjdk-headless \
"

URI_tomcat9-admin-webapps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-admin-webapps-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-admin-webapps = " \
 tomcat9 \
"

URI_tomcat9-docs-webapp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-docs-webapp-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-docs-webapp = " \
 tomcat9 \
"

URI_tomcat9-el-3.0-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-el-3.0-api-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-el-3.0-api = " \
 bash \
 javapackages-filesystem \
"

URI_tomcat9-jsp-2.3-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-jsp-2.3-api-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-jsp-2.3-api = " \
 tomcat-el-3.0-api \
 javapackages-filesystem \
 tomcat-servlet-4.0-api \
 tomcat9-el-3.0-api \
 tomcat9-servlet-4.0-api \
 bash \
"

URI_tomcat9-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-lib-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-lib = " \
 tomcat-el-3.0-api \
 javapackages-filesystem \
 tomcat-servlet-4.0-api \
 tomcat-jsp-2.3-api \
 tomcat9-el-3.0-api \
 tomcat9-jsp-2.3-api \
 ecj \
 tomcat9-servlet-4.0-api \
 coreutils \
"

URI_tomcat9-servlet-4.0-api = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-servlet-4.0-api-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-servlet-4.0-api = " \
 bash \
 javapackages-filesystem \
"

URI_tomcat9-webapps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat9-webapps-9.0.87-5.el10_0.3.noarch.rpm;unpack=0"
RDEPENDS:tomcat9-webapps = " \
 tomcat9 \
"
